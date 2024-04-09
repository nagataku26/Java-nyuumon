public class Pla54 {
  public static double calcTriangleArea(double bottom, double height) {
    double calc = bottom * height / 2;
    return calc;
  }
  public static double calcCircleArea(double radius) {
    double calc = radius * radius * 3.14;
    return calc;
  }
  public static void main(String[] args) {
    double calcTriangle = calcTriangleArea(10.0, 5.0);
    System.out.println(calcTriangle);

    double calcCircle = calcCircleArea(5.0);
    System.out.println(calcCircle);
  }
}
