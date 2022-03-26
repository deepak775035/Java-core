package classFolder.session4.ArrayFirst;

public class LowerTriangle {
    
    static void diplayLowerTriangle(int[][] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr[][]={{2,3,4,5},{4,5,6,3},{5,6,7,3},{5,6,8,3}};
        diplayLowerTriangle(arr);
    }
}
