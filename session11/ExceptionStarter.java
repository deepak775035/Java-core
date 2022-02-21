package session11;

public class ExceptionStarter {
    
    public static void tripleDev(int a, int b, int c){
            int divRes = 0;
            try {
                divRes=a/b;
                divRes/=c;
            } catch (ArithmeticException e) {
                System.out.println("Please do not use 0 as divisor");
            }


            int[] arr = new int[divRes];
            try {
                System.out.println("3rd ele : " + arr[2]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("cant dipay beacuse array is out of bound");
            }
    }

    
    public static void main(String[] args) {
        tripleDev(8, 0, 1);
    }
}
