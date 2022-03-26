package classFolder.session4.ArrayFirst;
import java.util.Arrays;

public class ArrayMerge {

  static int[] merge(int[] arrOne, int[] arrTwo) {
    int[] res = new int[arrOne.length + arrTwo.length];
    int indexOne = 0;
    int indexTwo = 0;
    int indexRes = 0;

    while (indexOne < arrOne.length && indexTwo < arrTwo.length) {
      res[indexRes++] =
        (arrOne[indexOne] < arrTwo[indexTwo])
          ? arrOne[indexOne++]
          : arrTwo[indexTwo++];
    }

    while (indexOne < arrOne.length) res[indexRes++] = arrOne[indexOne++];

    while (indexTwo < arrTwo.length) res[indexRes++] = arrTwo[indexTwo++];

    return res;
  }

  public static void main(String[] args) {
    int[] arr1 = { 2, 5, 8, 12, 45 };
    int[] arr2 = { 4, 5, 7, 14 };

    System.out.println(Arrays.toString(merge(arr1, arr2)));
  }
}
