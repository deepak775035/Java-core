package classFolder.session4.morning;

public class PrimeAndArm {

    static boolean isArm(int x) {

        int temp = x;
        int digit = 0;
        int armNum = 0;
        while (temp != 0) {
            digit = temp % 10;
            temp /= 10;
            armNum += digit * digit * digit;
        }

        return armNum == x;
    }

    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        int sqrnum = (int) Math.sqrt(num);

        for (int i = 2; i <= sqrnum; i++) {
            if (num % 2 == 0)
                return false;
        }
        return true;
    }

    static void displayPrimeAndArmstrong(int num) {

        for (int i = 1; i <= num; i++) {
            if(isPrime(i)){
                System.out.println(i+" is a Prime.");
            } else {
                if(isArm(i))
                    System.out.println(i+" is a Armstrong.");
                else
                    System.out.println(i+" is not a Armstron.");
            }
        }
    }

    public static void main(String[] args) {
        displayPrimeAndArmstrong(30);
    }

}
