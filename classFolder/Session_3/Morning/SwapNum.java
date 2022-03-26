package classFolder.Session_3.Morning;

import java.util.Scanner;

public class SwapNum {
    static void swap(int x,int y){
        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("After 7 90 swap --> x:"+x+" and y:"+y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println("Before swap --> x:"+x+" and y:"+y);
        swap(x, y);
        sc.close();
    }
}
