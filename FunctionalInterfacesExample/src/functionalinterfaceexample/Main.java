
package functionalinterfaceexample;

public class Main {

  public static void main(String[] args) {

    GreetingMessage gm  = new GreetingMessage() {
      @Override
      public void greet(String name) {
        System.out.println("Hello " + name);
      }
    };

    gm.greet("Marcos");

    GreetingMessage gmLambda = (String name) -> {
      System.out.println("Hello " + name);
    };

    gmLambda.greet("Gomes");

    MessagePrinter mp = () -> {
      System.out.println("Message");
    };

    mp.printMessage();
  }

}
