package classFolder.session10.weekendTask;

import java.util.Random;

class Coin{

    String sideUp;
    int value;

    public Coin(int value) {
        sideUp = randomSideGenerator();
        this.value = value;
    }

    public void toss()
    {
        sideUp = randomSideGenerator();
    }

    public String getSideUp() {
        return sideUp;
    }

    String randomSideGenerator()
    {
        
        Random rand = new Random();
        boolean mySide = rand.nextBoolean();
        
        if(mySide) return "heads";
        return "tails";
    }

}



public class CoinTossGameDriver {

    static int balanceInCents = 0;

    public static void makeAToss(Coin coin){
        coin.toss();
        if (coin.getSideUp().equals("heads")) {
            balanceInCents += coin.value;
            System.out.println("After head balance="+balanceInCents+" ac val:"+coin.value);
        }
        else System.out.println("After Tail balance="+balanceInCents+" ac val:"+coin.value);
    }

    public static void main(String[] args) {
        Coin quarter = new Coin(25);
        Coin dime =  new Coin(10);
        Coin nickel = new Coin(5);

        do {
            balanceInCents=0;

            while (balanceInCents < 100) {
                
                makeAToss(quarter);
                
                makeAToss(dime);
                
                makeAToss(nickel);
                
            }
            
            System.out.println("\n\n");
        } while (balanceInCents!=100);
            
        if (balanceInCents == 100) System.out.print("Win");
        else System.out.println("Loose"); 

    }
}
