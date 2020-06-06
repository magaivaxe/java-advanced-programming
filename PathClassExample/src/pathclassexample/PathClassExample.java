package pathclassexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathClassExample {

  public static void main(String[] args) {
    Path path = Paths.get("Hello World.txt");

    try {
      Files.deleteIfExists(path);
    } catch (IOException e) {
      e.printStackTrace();
    }

    Path source = Paths.get("/home/magaiver/Documents/testSpring.groovy");
    System.out.println(source.getParent());
    System.out.println(source.getRoot());
    System.out.println(source.getFileName());


    // copy file
    Path dest = Paths.get("/home/magaiver/Documents/newgroovy.groovy");

    try {
      Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
