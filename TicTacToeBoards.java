import java.awt.Color;

/**
 * This is a class that draws various Tic-Tac-Toe Boards
 * 
 * @author CJ Dobbins
 * @version Assignment 3: Tic-Tac-Toe
 * @version Challenge
 */
public class TicTacToeBoards {
  
  //Container for a new window
  private NsccWindow win;
  
  /**
   * Constructor creates a new window and draws 4 boards
   */
  public TicTacToeBoards() {
    //instantiate a new window
    win = new NsccWindow(10, 10, 300, 330);
    win.setTitle("Tic-Tac-Toe Boards");
    //draw four different boards
    drawBoard(40, 40, Color.red);
    drawBoard(40, 170, 2);
    drawBoard(170, 40, Math.PI/12);
    drawBoard(170, 170);
  }
  
  /*
   * Method to create a basic board
   * 
   * @param x is the x-coordinate for the top left of the board
   * @param y is the y-coordinate for the top left of the board
   */
  public void drawBoard(int x, int y) {
    //create lines for the board
    NsccLine vert1;
    NsccLine vert2;
    NsccLine horiz1;
    NsccLine horiz2;
    vert1 = new NsccLine(x+30, y, x+30, y+90);
    vert2 = new NsccLine(x+60, y, x+60, y+90);
    horiz1 = new NsccLine(x, y+30, x+90, y+30);
    horiz2 = new NsccLine(x, y+60, x+90, y+60);
    //add lines to the window
    win.add(vert1);
    win.add(vert2);
    win.add(horiz1);
    win.add(horiz2);
    win.repaint();
  }
  
  /*
   * Overload method to create a board with color
   * 
   * @param x is the x-coordinate for the top left of the board
   * @param y is the y-coordinate for the top left of the board
   * @param c is a color from java.awt.Color
   */
  public void drawBoard(int x, int y, Color c) {
    //create lines for the board
    NsccLine vert1;
    NsccLine vert2;
    NsccLine horiz1;
    NsccLine horiz2;
    vert1 = new NsccLine(x+30, y, x+30, y+90);
    vert2 = new NsccLine(x+60, y, x+60, y+90);
    horiz1 = new NsccLine(x, y+30, x+90, y+30);
    horiz2 = new NsccLine(x, y+60, x+90, y+60);
    //add lines to the window
    win.add(vert1);
    win.add(vert2);
    win.add(horiz1);
    win.add(horiz2);
    //color the lines
    vert1.setForeground(c);
    vert2.setForeground(c);
    horiz1.setForeground(c);
    horiz2.setForeground(c);
    win.repaint();
  }
  
  /*
   * Overload method to change line width of a board
   * 
   * @param x x-coordinate for the top left of the board
   * @param y y-coordinate for the top left of the board
   * @param lineWidth pixel width of line
   */
  public void drawBoard(int x, int y, int lineWidth) {
    //this time we are using filled rectangles to simulate line width
    NsccRectangle vert1;
    NsccRectangle vert2;
    NsccRectangle horiz1;
    NsccRectangle horiz2;
    vert1 = new NsccRectangle(x+30, y, lineWidth, 90);
    vert2 = new NsccRectangle(x+60, y, lineWidth, 90);
    horiz1 = new NsccRectangle(x, y+30, 90, lineWidth);
    horiz2 = new NsccRectangle(x, y+60, 90, lineWidth);
    win.add(vert1);
    win.add(vert2);
    win.add(horiz1);
    win.add(horiz2);
    vert1.setFilled(true);
    vert2.setFilled(true);
    horiz1.setFilled(true);
    horiz2.setFilled(true);
    vert1.setBackground(Color.black);
    vert2.setBackground(Color.black);
    horiz1.setBackground(Color.black);
    horiz2.setBackground(Color.black);
    win.repaint();
  }
  
  /*
   * Overload method to rotate board
   * 
   * @param x x-coordinate for the top left of the board
   * @param y y-coordinate for the top left of the board
   * @param rotate angle in radians to rotate board
   */
  public void drawBoard(int x, int y, double rotate) {
    NsccLine vert1;
    NsccLine vert2;
    NsccLine horiz1;
    NsccLine horiz2;
    //Center of the board calculated from top left of board
    int centX = x + 45;
    int centY = y + 45;
    //radius from center to line endpoints
    double radius = Math.sqrt(2250);
    //calculated endpoints based on radius and angle
    //rotation angle is added to original angle to
    //find new angle for each endpoint
    double v1X1 = radius*Math.cos(Math.PI/2+.321751 + rotate) + centX;
    double v1Y1 = radius*Math.sin(Math.PI/2+.321751 + rotate) + centY;
    double v1X2 = radius*Math.cos(Math.PI+1.24905 + rotate) + centX;
    double v1Y2 = radius*Math.sin(Math.PI+1.24905 + rotate) + centY;
    double v2X1 = radius*Math.cos(1.24905 + rotate) + centX;
    double v2Y1 = radius*Math.sin(1.24905 + rotate) + centY;
    double v2X2 = radius*Math.cos(3*Math.PI/2+.321751 + rotate) + centX;
    double v2Y2 = radius*Math.sin(3*Math.PI/2+.321751 + rotate) + centY;
    double h1X1 = radius*Math.cos(Math.PI/2+1.24905 + rotate) + centX;
    double h1Y1 = radius*Math.sin(Math.PI/2+1.24905 + rotate) + centY;
    double h1X2 = radius*Math.cos(.321751 + rotate) + centX;
    double h1Y2 = radius*Math.sin(.321751 + rotate) + centY;
    double h2X1 = radius*Math.cos(Math.PI + .321751 + rotate) + centX;
    double h2Y1 = radius*Math.sin(Math.PI + .321751 + rotate) + centY;
    double h2X2 = radius*Math.cos(3*Math.PI/2 + 1.24905 + rotate) + centX;
    double h2Y2 = radius*Math.sin(3*Math.PI/2 + 1.24905 + rotate) + centY;
    vert1 = new NsccLine((int) v1X1, (int) v1Y1, (int) v1X2, (int) v1Y2);
    vert2 = new NsccLine((int) v2X1, (int) v2Y1, (int) v2X2, (int) v2Y2);
    horiz1 = new NsccLine((int) h1X1, (int) h1Y1, (int) h1X2, (int) h1Y2);
    horiz2 = new NsccLine((int) h2X1, (int) h2Y1, (int) h2X2, (int) h2Y2);
    win.add(vert1);
    win.add(vert2);
    win.add(horiz1);
    win.add(horiz2);
    win.repaint();
  }
  
  /*
   * Application method to create new boards
   * 
   * @param args command line arguments
   */
  public static void main(String[] args) {
    TicTacToeBoards boards;
    boards = new TicTacToeBoards();
  }
  
}
  