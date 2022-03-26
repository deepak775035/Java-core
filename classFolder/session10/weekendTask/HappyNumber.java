package classFolder.session10.weekendTask;

public class HappyNumber {
    
    static int squareAddDigit(int temp){
        int ans=0;
        int digit=0;

        while(temp>0){
            digit=temp%10;
            digit=digit*digit;
            ans+=digit;
            temp/=10;
        }

        return ans;
    }
    
    public static boolean isHappyNumber(int num){
        int temp=num;
        System.out.println("\nChecking for "+num);

        do {
            temp=squareAddDigit(temp);
            System.out.println(temp);
        } while (temp!=num && temp!=1);

        return temp==1;
    }
    
    public static void main(String[] args) {
        System.out.println(isHappyNumber(32));
        System.out.println();
        System.out.println(isHappyNumber(100));
        System.out.println();
        System.out.println(isHappyNumber(58));
        System.out.println();
        System.out.println(isHappyNumber(4));
       
    }
}
