//Rectangle_Final.java

public class Rectangle_Final 
{
  public static void main(String[] args) 
  {
    // Create rectangle shapes
    Shape rectangle = new Rectangle(55, 35);
    
    // Calculate area and perimeter of rectangle shape
    System.out.println("\nArea and perimeter of rectangle shapes:");
    System.out.println("\nRectangle: Length-55, Width-35");
    System.out.println("Area: " + rectangle.getArea());
    System.out.println("Perimeter: " + rectangle.getPerimeter());
  }
}
