/**
 * A new beanie style hat for the snowman.
 * 
 * @author CJ Dobbins
 * @version Lab 5: Snowman's Hat
 * @version Check
 */
public class Beanie extends NsccComponent {
 
  // The pieces of the beanie
  private NsccComponent cap;
  private NsccComponent inside1;
  private NsccComponent inside2;
  
  /**
   * The 'default' constructor for Beanie.
   * This creates a black hat at location (10, 10).
   */
  public Beanie() {
    this(10, 10);
  }
  
  /**
   * A constructor for the beanie. This creates a blue beanie
   * with elliptical lines to simulate depth.  The component
   * height is half the height of the ellipses in order to get
   * a semicircle effect.
   * 
   * @param x The x-coordinate for the beanie.
   * @param y The y-coordinate for the beanie.
   */
  public Beanie(int x, int y) {
    super(x, y, 50, 25);
    // create the pieces of the hat
    cap = new NsccEllipse(0, 0, 50, 50);
    cap.setBackground(java.awt.Color.blue);
    cap.setFilled(true);
    inside1 = new NsccEllipse(10, 0, 30, 50);
    inside2 = new NsccEllipse(20, 0, 10, 50);
    // add the pieces to the hat
    add(cap);
    this.add(inside1);
    this.add(inside2);
  }
}
