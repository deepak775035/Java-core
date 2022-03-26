package classFolder.session14;

import java.util.Arrays;

public class AnagramsTask {
    
    static boolean isAnagram(String str1,String str2){

        //To make case insensitive 
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        str1=str1.replaceAll(" ", "");
        str2=str2.replaceAll(" ", "");

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();


        if(str1.length() != str2.length())
            return false;


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr2.length; i++) 
            if (arr1[i]!=arr2[i])
                return false;
                
        int count=1;   //keeping count of initial element
        for (int i = 1; i < arr2.length; i++) {
            if(arr2[i-1]==arr2[i])
                continue;
            
            count++;
        }
        
        System.out.println("Unique Count:"+count);
        return true;
    }
    
    public static void main(String[] args) {
        String string1 = "Tom Marvolo Riddle";
       // String string2 = "I am Lord Voldemort";
        String string2 = "ToMm arvolod Ridle";

        System.out.println(isAnagram(string1, string2));
    }
}
