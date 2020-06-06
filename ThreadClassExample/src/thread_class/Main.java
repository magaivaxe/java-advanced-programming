package thread_class;

public class Main {

  public static void main(String[] args) {

    ThreadExample te = new ThreadExample();
    te.setName("My first thread");
    te.start();
  }

}
