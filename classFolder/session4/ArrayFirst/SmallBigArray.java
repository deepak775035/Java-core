package classFolder.session4.ArrayFirst;

public class SmallBigArray {

  static int largest(int[] arr) {
    int i = 1;
    int big = arr[0];

    while (i < arr.length) {
      if (big < arr[i]) big = arr[i];
      i++;
    }

    return big;
  }

  static int smallest(int[] arr) {
    int i = 1;
    int small = arr[0];
    while (i < arr.length) {
      if (small > arr[i]) small = arr[i];
      i++;
    }

    return small;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 6, 7, -5, 32 };

    System.out.println("Smallest =" + smallest(arr));
    System.out.println("Largest  =" + largest(arr));
  }
}
