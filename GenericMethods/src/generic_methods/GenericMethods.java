package generic_methods;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericMethods {

  static Character[] charArray = { 'h', 'e', 'l', 'l', 'o' };
  static Integer[] intArray = { 1, 2, 3, 4, 5 };
  static Boolean[] boolArray = { true, false, true };
  static String[] strArray = {"test", "test"};

  /**
   * @param <T> generic type that specifies the type will be use inside method
   */
  public static <T> List<T> arrayToList(T[] array, List<T> list) {
    for (T object : array) {
      list.add(object);
    }
    return list;
  }

  public static void main(String[] args) {
    List<Character> charList = arrayToList(charArray, new ArrayList<>());
    List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
    List<Integer> intList = arrayToList(intArray, new ArrayList<>());
    List<String> strList = arrayToList(strArray, new LinkedList<>());
    System.out.println(intList.get(0));
  }

}
