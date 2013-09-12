/*
 * Super class for the various MyShape classes
 * 
 * @author CJ Dobbins
 * @version Assignment 5: Shape Hierarchy
 * @version Standard
 */
public class MyShape {
   //height and width variables for use by MyShape
   //and the MyShape subclasses
   protected int height;
   protected int width;
   
   /*
    * Basic shape constructor to define the width and height
    *
    * @param h Height of the shape
    * @param w Width of the shape
    */
   public MyShape(int h, int w) {
      height = h;
      width = w;
   }
   
   /* 
    * This method returns the height of the shape
    *
    * @return integer value of the height
    */
   public int getHeight() {
      return height;
   }
   
   /* 
    * This method returns the width of the shape
    * 
    * @return integer value of the width
    */
   public int getWidth() {
      return width;
   }
   
   /*
    * This method returns the name of the shape
    * 
    * @return String containing the name "shape"
    */
   public String getName() {
      return "shape";
   }
   
   /*
    * This method returns the area of the shape
    * 
    * @return Placeholder for the MyShape subclasses - returns 0
    */
   public double getArea() {
     return 0;
   }
   
   /*
    * This method returns the perimeter of the shape
    * 
    * @return Placeholder for the MyShape subclasses - returns 0
    */
   public double getPerimeter() {
     return 0;
   }
   
}