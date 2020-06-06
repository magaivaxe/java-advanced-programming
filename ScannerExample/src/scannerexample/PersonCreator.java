
package scannerexample;

import java.util.Scanner;

public class PersonCreator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter your name, age and phone number: ");
    String name = scanner.next();
    int age = scanner.nextInt();
    long phone = scanner.nextLong();
    scanner.close();

    Person person = new Person(name, age, phone);
  }

}
