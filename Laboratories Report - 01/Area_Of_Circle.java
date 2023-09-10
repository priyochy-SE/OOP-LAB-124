package area_of_circle;

import java.util.Scanner;

public class Area_Of_Circle 
{
 public static void main(String ag[]) 
  {
  int rad;
  double pie = 3.1416, Area;
  Scanner s = new Scanner(System.in);
  System.out.print("Enter radius of circle: ");
  rad = s.nextInt();
  Area = pie * rad * rad;
  System.out.println("\nArea of circle: " + Area);
 }
}
