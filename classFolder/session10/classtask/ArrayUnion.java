package classFolder.session10.classtask;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayUnion {


    public static boolean isNotInArray(int x,int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x)return false;
        }

        return true;
    }
    
    public static int[] arrUnion(int[] arr1,int[] arr2){
        int[] tempAns = new int[arr1.length+arr2.length];

        //making arr copy from one to temp
        int index=0;
        while(index<arr1.length){
            tempAns[index]=arr1[index];
            index++;
        }
        

        for(int i=0;i<arr2.length;i++){
            if(isNotInArray(arr2[i],arr1)){
                tempAns[index]=arr2[i];
                index++;
            }
        }


        //making arr copy from temp to final
        int[] finalAns = new int[index];
        for (int i = 0; i < finalAns.length; i++) {
            finalAns[i]=tempAns[i];
        }

        return finalAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int arrOneLenght = sc.nextInt();
        // int arrTwoLenght = sc.nextInt();

        // int[] arrOne = new int[arrOneLenght];
        // int[] arrTwo = new int[arrTwoLenght];

        int[] arrOne = {85,25,1,32,54,6};
        int[] arrTwo = {85,2};

        // int i=0;
        // while(i<arrOneLenght)
        //     arrOne[i++]=sc.nextInt();

        // i=0;
        // while(i<arrTwoLenght)
        //     arrTwo[i++]=sc.nextInt();

        System.out.println(Arrays.toString(arrUnion(arrOne, arrTwo)));

        sc.close();
    }
}
