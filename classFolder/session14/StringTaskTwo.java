package classFolder.session14;

import java.util.Arrays;

public class StringTaskTwo {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "python";

        char[] arrStr1 = str1.toCharArray();
        char[] arrStr2 = str2.toCharArray();

        Arrays.sort(arrStr1);
        Arrays.sort(arrStr2);

        char[] finalArr = new char[arrStr1.length+arrStr2.length];

        int i = 0, j = 0, index=0;
        while(i < arrStr1.length && j<arrStr2.length)
            finalArr[index++]=(arrStr1[i]<arrStr2[j])?arrStr1[i++]:arrStr2[j++];
        

        while(i < arrStr1.length)
            finalArr[index++]=arrStr1[i++];

        while(j<arrStr2.length)
            finalArr[index++]=arrStr2[j++];

        String finalStr = new String(finalArr);

        System.out.println(finalStr);
    }
}
