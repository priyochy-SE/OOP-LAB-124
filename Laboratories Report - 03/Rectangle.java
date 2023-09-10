//Rectangle.java (Part - 02)

public class Rectangle extends Shape 
{
  private final double length;
  private final double width;

  public Rectangle(double length, double width) 
  {
    this.length = length;
    this.width = width;
  }
  @Override
  public double getArea() 
  {
    return length * width;
  }
  @Override
  public double getPerimeter() 
  {
    return 2 * (length + width);
  }
}
