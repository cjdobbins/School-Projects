/*
 * MyEllipse is a shape in the MyShape family
 * 
 * @author CJ Dobbins
 * @version Assignment 5: Shape Hierarchy
 * @version Standard
 */
public class MyEllipse extends MyShape {
  
  /*
   * Constructor calls to the superclass to set
   * the width and height
   * 
   * @param h The height of the ellipse
   * @param w The width of the ellipse
   */
  public MyEllipse(int h, int w) {
    super(h, w);
  }
  
  /*
   * Method to return the name of the shape
   * 
   * @return String containing the name "ellipse"
   */
  public String getName() {
    return "ellipse";
  }
  
  /*
   * Method to return the area
   * 
   * @return double value of the area
   */
  public double getArea() {
    return Math.PI/4 * width * height;
  }
  
  /*
   * Method to return the perimeter
   * 
   * @return double value of the perimeter
   */
  public double getPerimeter() {
    return Math.PI/2 * (3 * (width + height) - 
           Math.sqrt((3*height + width) * (height + 3*width)));
  }
  
}