
package hashmapexample;

import java.util.HashMap;

public class HashMapExample {

  public static void main(String[] args) {
    HashMap<String, Integer> phoneBook = new HashMap<>();
    phoneBook.put("kevin", 12345);
    phoneBook.put("jill", 9876);
    phoneBook.put("marcos", 2222);
    phoneBook.put("marcos", 111222222);

    if (phoneBook.containsKey("marcos")) {
      phoneBook.remove("marcos");
    }

    phoneBook.clear();

    System.out.println(phoneBook);
  }

}
