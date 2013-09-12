public class Bricks {
  
  public static final int WIDTH = 200;
  public static final int HEIGHT = 150;
  public static final java.awt.Color BRICK = new java.awt.Color(136, 0, 21);
  
  public void oneBrick() {
    DrawingPanel win = new DrawingPanel(WIDTH, HEIGHT);
    java.awt.Graphics g = win.getGraphics();
    win.setTitle("Two Bricks");
    drawBrick(30, 30, g);
    drawBrick(10, 10, g);
  }
  
  public void drawBrick(int x, int y, java.awt.Graphics g) {
    g.setColor(BRICK);
    g.fillRect(x, y, 40, 20);
    g.setColor(java.awt.Color.black);
    g.drawRect(x, y, 40, 20);
  }
  
  public void bricks1() {
    DrawingPanel win = new DrawingPanel(WIDTH, HEIGHT);
    java.awt.Graphics g = win.getGraphics();
    win.setTitle("Bricks - Version 1");
    for(int y = -10; y < HEIGHT; y += 40) {
      for(int x = -10; x < WIDTH; x += 40) {
        drawBrick(x, y, g);
      }
      for(int x = -30; x < WIDTH; x += 40) {
        drawBrick(x, y + 20, g);
      }
    }
  }
    
  
  public static void main(String[] args) {
    Bricks brick = new Bricks();
    brick.bricks1();
  }
}
    