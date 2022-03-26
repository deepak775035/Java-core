package classFolder.session4.ArrayFirst;

import java.util.Arrays;

public class MatrixAddition {

  static int[][] matrixAdd(int firstMatrix[][], int secondMatrix[][]) {
    int ans[][] = new int[firstMatrix.length][firstMatrix[0].length];

    for (int i = 0; i < ans.length; i++) {
      for (int j = 0; j < ans[0].length; j++) {
        ans[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int firstMatrix[][]  = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
    int secondMatrix[][] = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };

    int res[][]= matrixAdd(firstMatrix, secondMatrix);
    
    for (int[] row : res) {
      System.out.println(Arrays.toString(row));
    }
  }
}
