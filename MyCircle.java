/*
 * MyCircle is a subclass of MyEllipse
 * 
 * @author CJ Dobbins
 * @version Assignment 5: Shape Hierarchy
 * @version Standard
 */
public class MyCircle extends MyEllipse {
  
  /*
   * Constructor calls to the superclass and sets
   * width and height of the ellipse to the 
   * diameter of the circle
   * 
   * @param diameter The diameter of the circle
   */
  public MyCircle(int diameter) {
    super(diameter, diameter);
  }
  
  /*
   * Method to return the name of the shape
   * 
   * @return String containing the name "circle"
   */
  public String getName() {
    return "circle";
  }
  
}