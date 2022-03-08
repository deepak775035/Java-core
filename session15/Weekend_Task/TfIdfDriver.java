package session15.Weekend_Task;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class TfIdfDriver {

    // STEP 00000000000000000
    static String readMyFile(FileReader in) throws IOException {
        StringBuilder ans = new StringBuilder();
        int i;
        while ((i = in.read()) != -1)
            ans.append((char) i);

        return ans.toString();
    }

    // STEP 1111111111111111111
    static String punctuationRemoval(String str){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetterOrDigit(str.charAt(i)) || Character.isWhitespace(str.charAt(i)))
                ans.append(str.charAt(i));
        }

        return ans.toString();
    }


    //STEP 3333333333333333333333333
    static String loweringCase(String str){
        return str.toLowerCase();
    }


    static ArrayList<String> removeStopWords(String[] str){
        ArrayList<String> myStr = new ArrayList<>(Arrays.asList(str));
        //String[] stopWordArr={"i", "me", "my", "myself", "we", "our", "ours", "ourselves", "you", "you\'re" , "you\'ve", "you\'ll", "you\'d", "your", "yours", "yourself", "yourselves", "he", "most", "other", "some", "such", "no", "nor", "not", "only", own, same, so, then, too, very, s, t, can, will, just, don, don’t, should, should’ve, now, d, ll, m, o, re, ve, y, ain, aren’t, could, couldn’t, didn’t, didn’t};
        //ArrayList<String> stopWords = new ArrayList<>(Arrays.asList(stopWordArr));

        for (int i = 0; i < str.length; i++) {
            
        }

        return null;
    }

    static String[] allFun(String str){
        str=punctuationRemoval(str);
        str=loweringCase(str);
        String str1[]=str.split(" ");
        return str1;
    }

    public static void main(String[] args) throws IOException{
      
        
        String myStr = readMyFile(new FileReader("session15/Weekend_Task/file1.txt"));
        String strArr[] =allFun(myStr);
        System.out.println(Arrays.toString(strArr));

        myStr = readMyFile(new FileReader("session15/Weekend_Task/file2.txt"));
         strArr= allFun(myStr);
        System.out.println(Arrays.toString(strArr));

        myStr = readMyFile(new FileReader("session15/Weekend_Task/file3.txt"));
        strArr =allFun(myStr);
        System.out.println(Arrays.toString(strArr));

        myStr = readMyFile(new FileReader("session15/Weekend_Task/file4.txt"));
        strArr =allFun(myStr);
        System.out.println(Arrays.toString(strArr));
        
    }
}
