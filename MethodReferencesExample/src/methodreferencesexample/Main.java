package methodreferencesexample;

public class Main {

  public static void main(String[] args) {

    Square s = new Square(4);

    // as it is just one method in Shapes. Shapes will return the same value return by calculate area in Square
    Shapes shapes = Square::calculateArea;

    System.out.println("Area: " + shapes.getArea(s));

  }

}
