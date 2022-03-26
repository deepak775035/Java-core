package classFolder.session12.file_handling_task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    File sourceFile = new File("session12/file_handling_task1/inFile.txt");
    File targetFile = new File("session12/file_handling_task1/outFile.txt");

    copyContent(sourceFile, targetFile);
  }

  public static void copyContent(File a, File b) throws IOException  {
    FileInputStream in = new FileInputStream(a);
    FileOutputStream out = new FileOutputStream(b);

    try {
      int n;
      while ((n = in.read()) != -1) {
        out.write(n);
      }
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      in.close();
      out.close();
    }

    System.out.println("File Copied");
    
  }
}
