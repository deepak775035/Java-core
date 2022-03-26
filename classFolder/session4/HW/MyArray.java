package classFolder.session4.HW;
import java.util.Arrays;
import java.util.Scanner;



public class MyArray {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int[] arr = new int[10];

    Arrays.fill(arr, 0);
    
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
    }
    
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] + 1;
    }
    
    Arrays.sort(arr);
    
    System.out.println("Best Scores");
    for (int i = arr.length - 1; i > 4; i--) {
      System.out.println(arr[i]);
    }
    scanner.close();
  }
}
