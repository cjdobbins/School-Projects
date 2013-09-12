/*
 * MyRectangle is a shape in the MyShape family
 * 
 * @author CJ Dobbins
 * @version Assignment 5: Shape Hierarchy
 * @version Standard
 */
public class MyRectangle extends MyShape {
  
  /*
   * This constructor calls to the super class
   * to set the width and height
   * 
   * @param h Height of the rectangle
   * @param w Width of the rectangle
   */
  public MyRectangle(int h, int w) {
    super(h, w);
  }
  
  /*
   * Method to return the name of the rectangle
   * 
   * @return A string containing the name "rectangle"
   */
  public String getName() {
    return "rectangle";
  }
  
  /*
   * Method to return the area
   * 
   * @return Double value of the area
   */
  public double getArea() {
    return width * height;
  }
  
  /*
   * Method to return the perimeter
   * 
   * @return Double value of the perimeter
   */
  public double getPerimeter() {
    return 2 * width + 2 * height;
  }
  
}