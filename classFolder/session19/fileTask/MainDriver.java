package classFolder.session19.fileTask;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainDriver {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("session19/fileTask/myfile.txt");        
        StringBuilder str = new StringBuilder();
        int charCount = 0;
        int wordCount = 0;
        int i;

        while ((i = fr.read()) != -1) {
            
            // for adding string 123 after 2nd word
            if ((char) i == ' ') 
                if(++wordCount==2)
                    str.append("123");

            //adding file contens to str stringbuilder
            str.append((char) i);

            //for adding @ after char 5
            if (++charCount == 5)
                str.append('@');
        }
        fr.close();

        //writing back
        FileWriter fout = new FileWriter("session19/fileTask/myfile.txt");
        fout.write(str.toString());
        fout.close();
    }
}
