
package fileexample;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {

  public static void main(String[] args) {
    File myFile = new File("/home/magaiver/myfile.txt");

    try {
      boolean fileCreatead = myFile.createNewFile();
      System.out.println("file createad : " + fileCreatead);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}