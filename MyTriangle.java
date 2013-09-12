/*
 * MyTriangle is a shape in the MyShape family
 * 
 * @author CJ Dobbins
 * @version Assignment 5: Shape Hierarchy
 * @version Standard
 */
public class MyTriangle extends MyShape {
  
  /*
   * Constructor sets the width and height
   * to the base and height of the triangle
   * 
   * @param base The base of the triangle
   * @param height The height of the triangle
   */
  public MyTriangle(int base, int height) {
    super(base, height);
  }
  
  /*
   * Method to return the name of the triangle
   * 
   * @return String containing the name "triangle"
   */
  public String getName() {
    return "triangle";
  }
  
  /*
   * Method to return the area
   * 
   * @return double value of the area
   */
  public double getArea() {
    return width * height * .5;
  }
  
  /*
   * Method to return the perimeter
   * 
   * @return double value of the perimeter
   */
  public double getPerimeter() {
    return width + height + Math.sqrt(width * width + 
            height * height);
  }
  
}