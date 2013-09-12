// Allow short name access to java.awt.Color
import java.awt.Color;

/**
 * This is the shell for programming assignment 3.
 * This program draws a simple scene using additional
 * classes that the student creates.
 * 
 * @author Dan Jinguji 
 * @author CJ Dobbins
 * @version Assignment 4: MyScene
 */
public class MyScene extends NsccWindow {

  // instance variables
  private MyHouse house;
  private MyHouse house2;
  private MyHouse house3;
  private MyTree tree;
  private MyTree tree2;
  private MyTree tree3;
  
  /**
   * Constructor for objects of class MyScene
   */
  public MyScene() {
    // Specify the constructor for the superclass
    super(10, 10, 400, 300);
    // set characteristics for the object
    setTitle("My Scene");
    
    // Draw the sky
    getContentPane().setBackground(new Color(0x00, 0xCC, 0xFF));
    
    // Draw some grass
    NsccRectangle grass = new NsccRectangle(0, 100, 400, 200);
    grass.setBackground(new Color(0x00, 0x99, 0x00));
    grass.setFilled(true);
    add(grass);
    
    // Draw three houses
    house = new MyHouse(50, 50);
    add(house);
    house2 = new MyHouse(200, 50, Color.yellow);
    add(house2);
    house3 = new MyHouse(125, 100, new Color(0x99, 0x00, 0x99));
    add(house3);
    
    // Draw three trees
    tree = new MyTree(340, 50);
    add(tree);
    tree2 = new MyTree(320, 100, Color.red);
    add(tree2);
    tree3 = new MyTree(300, 150, Color.yellow);
    add(tree3);
    
  }
  
  /**
   * Alter the scene, by changing color
   */
  public void change1() {
    // change the  color of the houses
    house.setColor(new Color(0xFF, 0x00, 0x00));
    house2.setColor(new Color(0xAA, 0x00, 0x00));
    house3.setColor(new Color(0x88, 0x00, 0x00));
    
    // change the color of the trees
    tree.setColor(new Color(0xDD, 0xDD, 0xDD));
    tree2.setColor(new Color(0xAA, 0xAA, 0xAA));
    tree3.setColor(new Color(0x88, 0x88, 0x88));
    
    // request a rerendering of the window
    repaint();
  }
  
  /**
   * Alter the scene, by changing location
   */
  public void change2() {
    // change the location of the houses
    house.setLocation(10, 50);
    house2.setLocation(150, 50);
    house3.setLocation(300, 50);
    
    // change the location of the trees
    tree.setLocation(10, 150);
    tree2.setLocation(150, 150);
    tree3.setLocation(300, 150);
    
    // request a rerendering of the window
    repaint();
  }
  
  /**
   * Alter the scene, by changing size
   */
  public void change3() {
    // change the size of the house
    house.setSize(80, 60);
    // request a rerendering of the window
    repaint();
  }
  
  /**
   * Alter the scene, restoring original settings
   */
  public void reset() {
    // reset the initial values for the houses
    house.setLocation(50, 50);
    house.setColor(Color.blue);
    house.setSize(120, 90);
    house2.setLocation(200, 50);
    house2.setColor(Color.yellow);
    house3.setLocation(125, 100);
    house3.setColor(new Color(0x99, 0x00, 0x99));
    
    //reset the initial values for the trees
    tree.setLocation(340, 50);
    tree.setColor(new Color(0x00, 0x99, 0x00));
    tree2.setLocation(320, 100);
    tree2.setColor(Color.red);
    tree3.setLocation(300, 150);
    tree3.setColor(Color.yellow);
    // request a rerendering of the window
    repaint(); 
  }
  
  /**
   * The application method, to test your code
   *
   * @param args The command-line arguments
   */
  public static void main(String[] args) {
     MyScene aScene;
     // instantiate MyScene
     aScene = new MyScene();
     // pause
     javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");

     // test setColor
     aScene.change1();
     javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");

     // test setLocation
     aScene.change2();
     javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");

     // test setSize
     aScene.change3();
     javax.swing.JOptionPane.showMessageDialog(null, "Press OK to continue");

     // reset initial values
     aScene.reset();
  }
  
}
