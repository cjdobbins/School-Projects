/**
 * Class creates various tile patterns
 * 
 * @author CJ Dobbins
 * @version Assignment 11: Tiling
 * @version Minimal
 */
public class Tiles {
  
  public static final int WIDTH = 200;
  public static final int HEIGHT = 150;
  
  /**
   * Constructor calls the tiling methods
   */
  public Tiles() {
    basketWeave();
    med1();
    med2();
  }
  
  /**
   * Method for creating a basket weave pattern
   */
  public void basketWeave() {
    DrawingPanel win = new DrawingPanel(WIDTH, HEIGHT);
    java.awt.Graphics g = win.getGraphics();
    win.setTitle("Basket Weave");
    win.setLocation(10, 10);
    for(int y = -5; y < HEIGHT; y += 80) {
      for(int x = -5; x < WIDTH; x += 80) {
        basketDraw(x, y, g);
      }
      for(int x = -45; x < WIDTH; x += 80) {
        basketDraw(x, y+40, g);
      }
    }
  }
  
  /**
   * Helper method for the basketweave pattern
   * 
   * @param x X-axis location of tile
   * @param y Y-axis location of tile
   * @param g Graphics component
   */
  public void basketDraw(int x, int y, java.awt.Graphics g) {
    g.setColor(new java.awt.Color(255, 201, 14));
    g.fillRect(x, y, 40, 40);
    g.setColor(new java.awt.Color(185, 122, 87));
    g.fillRect(x+40, y, 40, 40);
    g.setColor(java.awt.Color.black);
    g.drawRect(x, y, 20, 40);
    g.drawRect(x+20, y, 20, 40);
    g.drawRect(x+40, y, 40, 20);
    g.drawRect(x+40, y+20, 40, 20);
  }
  
  /**
   * Method for creating mediterranean pattern
   */
  public void med1() {
    DrawingPanel win = new DrawingPanel(WIDTH, HEIGHT);
    java.awt.Graphics g = win.getGraphics();
    win.setTitle("Med. 1");
    win.setLocation(300, 10);
    win.setBackground(java.awt.Color.red);
    for(int y = -10; y < HEIGHT; y += 24) {
      for(int x = -10; x < WIDTH; x += 24) {
        octagon(x, y, g);
      }
    }
  }
  
  /**
   * Helper method for mediterranean to make octagon tiles
   * 
   * @param x X-axis location of tile
   * @param y Y-axis location of tile
   * @param g Graphics component
   */
  public void octagon(int x, int y, java.awt.Graphics g) {
    g.setColor(new java.awt.Color(255, 255, 64));
    int[] xs = {x+7, x+17, x+24, x+24, x+17, x+7, x, x};
    int[] ys = {y, y, y+7, y+17, y+24, y+24, y+17, y+7};
    g.fillPolygon(xs, ys, 8);
    g.setColor(java.awt.Color.black);
    g.drawPolygon(xs, ys, 8);
  }
               
  /** 
   * Method for alternate meditteranean pattern
   */
  public void med2() {
    DrawingPanel win = new DrawingPanel(WIDTH, HEIGHT);
    java.awt.Graphics g = win.getGraphics();
    win.setTitle("Med. 2");
    win.setLocation(600, 10);
    //This is as far as I could get in the 30 minutes
    //I had after work.  I usually do all the work for 
    //this class on the weekend.
  }
  
  /**
   * Application method for tiles
   * 
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    new Tiles();
  }
  
}
  