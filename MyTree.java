/**
 * A new tree component. 
 *
 * @author CJ Dobbins
 * @version Assignment 4: MyScene
 * @version Standard
 */
public class MyTree extends NsccComponent {
  
  // instance variables
  private NsccRectangle trunk;
  private NsccUpTriangle leaves1;
  private NsccUpTriangle leaves2;
  private NsccUpTriangle leaves3;
  
  /**
   * Constructor for objects of class MyTree
   * This creates a MyTree object at the specified
   * location
   * @param x the x-coordinate for the object
   * @param y the y-coordinate for the object
   */
  public MyTree(int x, int y) {
    // Specify the constructor for the superclass
    super(x, y, 50, 100);
    
    // Create the trunk object
    trunk = new NsccRectangle(20, 50, 10, 50);
    // Set the characteristics of the trunk
    trunk.setFilled(true);
    trunk.setBackground(new java.awt.Color(0x99, 0x33, 0x00));
    // Place the trunk in the MyTree object
    add(trunk);
    
    // Create the leaf objects
    leaves1 = new NsccUpTriangle(0, 30, 50, 50);
    leaves2 = new NsccUpTriangle(5, 15, 40, 40);
    leaves3 = new NsccUpTriangle(10, 0, 30, 30);
    // Set the characteristics of the leaves
    leaves1.setFilled(true);
    leaves2.setFilled(true);
    leaves3.setFilled(true);
    leaves1.setBackground(new java.awt.Color(0x00, 0x99, 0x00));
    leaves2.setBackground(new java.awt.Color(0x00, 0x99, 0x00));
    leaves3.setBackground(new java.awt.Color(0x00, 0x99, 0x00));
    // Place the leaves in the MyTree object
    add(leaves1);
    add(leaves2);
    add(leaves3);
  }
  
  /**
   * Overload constructor for objects of class MyTree.
   * This creates a MyTree object at the specified
   * location with a specified leaf color
   * @param x the x-coordinate for the object
   * @param y the y-coordinate for the object
   * @param c the color for the leaves
   */
  public MyTree(int x, int y, java.awt.Color c) {
    this(x, y);
    setColor(c);
  }

  /**
   * Change the color of the leaves
   * 
   * @param c The color for the leaves
   */
  public void setColor(java.awt.Color c) {
    leaves1.setBackground(c);
    leaves2.setBackground(c);
    leaves3.setBackground(c);
    repaint();
  }
  
  /**
   * Retrieve the color of the leaves
   * 
   * @return The color of the leaves
   */
  public java.awt.Color getColor() {
    return leaves1.getBackground();
  }
  
}