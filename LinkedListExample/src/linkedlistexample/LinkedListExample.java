
package linkedlistexample;

import java.util.LinkedList;

/**
 * Arraylist has most performance than linkedlist because linkedlist contains references and consumes more memory
 */
public class LinkedListExample {

  public static void main(String[] args) {
    LinkedList<String> myList = new LinkedList<>();
    myList.add("A");
    myList.add("B");
    myList.add(1, "C");
    System.out.println(myList);
    myList.remove("C");
    System.out.println(myList);
  }

}
