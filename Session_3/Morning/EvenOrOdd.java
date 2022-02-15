package Session_3.Morning;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();

        if(x%2==0)
            System.out.println(x+" Is Even");
        else
            System.out.println(x+" Is Odd");


        sc.close();
    }
}
