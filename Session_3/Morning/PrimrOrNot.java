package Session_3.Morning;


public class PrimrOrNot {

    static boolean isPrime(int num){
        
        for(int i=2;i<=num/2;i++){
            if(num%2==0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
        int x=6;

        if(isPrime(x))
            System.out.println(x+" is Prime");
        else
            System.out.println(x+" is not a Prime");
    }

    
}