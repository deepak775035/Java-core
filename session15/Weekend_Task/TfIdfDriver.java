package session15.Weekend_Task;

import java.io.FileReader;
import java.io.IOException;

public class TfIdfDriver {
    
    
    static String readMyFile(FileReader in) throws IOException {
        String ans = "";
        int i;
        while((i=in.read())!=-1)
            ans+=(char)i;

        return ans;
    }

    
    public static void main(String[] args) throws IOException{
      
        
        String myStr = readMyFile(new FileReader("session15/Weekend_Task/file1.txt"));
        System.out.println(myStr);

        myStr = readMyFile(new FileReader("session15/Weekend_Task/file2.txt"));
        System.out.println(myStr);

        myStr = readMyFile(new FileReader("session15/Weekend_Task/file3.txt"));
        System.out.println(myStr);

        myStr = readMyFile(new FileReader("session15/Weekend_Task/file4.txt"));
        System.out.println(myStr);
        
    }
}
