/*
 * MySquare is a subclass of MyRectangle
 * 
 * @author CJ Dobbins
 * @version Assignment 5: Shape Hierarchy
 * @version Standard
 */
public class MySquare extends MyRectangle {
  
  /*
   * Constructor calls to the superclass and inputs 
   * one side as the width and height
   * 
   * @param side The length of one side of the square
   */
  public MySquare(int side) {
    super(side, side);
  }
  
  /*
   * Method to return the name of the square
   * 
   * @return String containing the name "square"
   */
  public String getName() {
    return "square";
  }
  
}