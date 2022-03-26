package classFolder.session4.morning;

public class Armstrong {
    
    static boolean isArm(int x){

        int temp=x;
        int digit=0;
        int armNum=0;
        while(temp!=0){
            digit=temp%10;
            temp /=10;
            armNum+=digit*digit*digit;
        }

        if(armNum==x) return true;
        return false;
    }

    public static void main(String[] args) {
        int num=370;

        if(isArm(num))
            System.out.println("It is a armstrong");
        else
            System.out.println("it is NOT");
        
    }
}
