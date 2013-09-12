import java.awt.Color;

/**
 * This class draws various flags
 * 
 * @author CJ Dobbins
 * @version Assignment 2: Flags
 * @version Standard
 */
public class Flags {
  
  /**
   * This method opens a window and draws the flag of Niger
   * 
   * Calculations:
   *    fly:hoist::7:6::308:264
   *    orange:white:green::1:1:1 along hoist
   *    actual dimensions adjusted by one pixel
   *    overall flag:
   *       dimension: 308x264
   *       location:  (20, 20)
   *    horizontal bars:
   *       dimension:  308x88
   *       width x height/3
   *       locations:  (0,0), (0,88), (0,175)
   *    cirlce:
   *       centered in white bar
   *       dimension:  66x66
   *       bar height * .75
   *       location:   (121, 11)
   *       width/2 - circle diameter/2, (bar height - circle diameter)/2
   */
  public void drawNigerFlag() { 
    //create the window
    NsccWindow win;
    win = new NsccWindow(10, 10, 375, 350);
    win.setTitle("Niger");
    //create shapes for the flag
    NsccRectangle flag;
    flag = new NsccRectangle(20, 20, 308, 264);
    NsccRectangle orangeStripe;
    orangeStripe = new NsccRectangle(0, 0, 308, 264/3+1);
    NsccRectangle whiteStripe;
    whiteStripe = new NsccRectangle(0, 264/3, 308, 264/3+1);
    NsccRectangle greenStripe;
    greenStripe = new NsccRectangle(0, 264*2/3, 308, 264/3);
    NsccEllipse orangeCircle;
    orangeCircle = new NsccEllipse(121, 11, 66, 66);
    // add shapes to the window
    win.add(flag);
    flag.add(orangeStripe);
    flag.add(whiteStripe);
    flag.add(greenStripe);
    whiteStripe.add(orangeCircle);
    // color the shapes
    Color myOrange;
    myOrange = new Color(255, 127, 0);
    Color myGreen;
    myGreen = new Color(0, 204, 0);
    orangeStripe.setFilled(true);
    whiteStripe.setFilled(true);
    greenStripe.setFilled(true);
    orangeCircle.setFilled(true);
    orangeStripe.setBackground(myOrange);
    whiteStripe.setBackground(Color.white);
    greenStripe.setBackground(myGreen);
    orangeCircle.setBackground(myOrange);
    win.repaint();
  }
  
  /*
   * This method opens a new window and draws the flag of Sweden
   * 
   * Calulations:
   *    fly:hoist::8:5::416:260
   *    blue:yellow:blue::5:2:9::130:52:234 - along fly
   *    blue:yellow:blue::4:2:4::104:52:104 - along hoist
   *    overall flag:
   *       dimension:  416x260
   *       location:   (20, 20)
   *    blue blocks:
   *       dimensions:  130x104 & 234x104
   *       width*5/16 x height*4/10 & width*9/16 x height*4/10
   *       locations:  (0,0), (0, 156), (182, 0), (182, 156)
   */
  public void drawSwedenFlag() {
    //create the window
    NsccWindow win;
    win = new NsccWindow(400, 10, 500, 350);
    win.setTitle("Sweden");
    //create shapes for the flag
    NsccRectangle flag;
    flag = new NsccRectangle(20, 20, 416, 260);
    NsccRectangle blockA;
    blockA = new NsccRectangle(0, 0, 416*5/16, 260*4/10);
    NsccRectangle blockB;
    blockB = new NsccRectangle(0, 260*6/10, 416*5/16, 260*4/10);
    NsccRectangle blockC;
    blockC = new NsccRectangle(416*7/16, 0, 416*9/16, 260*4/10);
    NsccRectangle blockD;
    blockD = new NsccRectangle(416*7/16, 260*6/10, 416*9/16, 260*4/10);
    // add shapes to the window
    win.add(flag);
    flag.add(blockA);
    flag.add(blockB);
    flag.add(blockC);
    flag.add(blockD);
    // color the shapes
    flag.setFilled(true);
    blockA.setFilled(true);
    blockB.setFilled(true);
    blockC.setFilled(true);
    blockD.setFilled(true);
    flag.setBackground(Color.yellow);
    blockA.setBackground(Color.blue);
    blockB.setBackground(Color.blue);
    blockC.setBackground(Color.blue);
    blockD.setBackground(Color.blue);
    win.repaint();
  }
  
  /*
   * This method opens a new window and draws the flag of Norway
   * 
   * Calulations:
   *    fly:hoist::22:16::352:256
   *    red:white:blue:white:red::6:1:2:1:12::96:16:32:16:192 - along fly
   *    red:white:blue:white:red::6:1:2:1:6::96:16:32:16:96 - along hoist
   *    overall flag:
   *       dimension:  352x256
   *       location:   (20, 20)
   *    white blocks:
   *       dimensions:  112x112 & 208x112
   *       width*7/22 x height*7/16 & width*13/22 x height*7/16
   *       locations:  (0,0), (0, 144), (144, 0), (144, 144)
   *    red blocks:
   *       dimensions:  96x96 & 192x96
   *       width*6/22 x height*6/16 & width*12/22x height*6/16
   *       locations:  (0,0), (0, 160), (160, 0), (160, 160)
   */
  public void drawNorwayFlag() {
    // create a new window
    NsccWindow win;
    win = new NsccWindow(10, 400, 400, 350);
    win.setTitle("Norway");
    // create shapes for the flag
    NsccRectangle flag;
    flag = new NsccRectangle(20, 20, 352, 256);
    NsccRectangle whiteBlockA;
    whiteBlockA = new NsccRectangle(0, 0, 7*352/22, 7*256/16);
    NsccRectangle whiteBlockB;
    whiteBlockB = new NsccRectangle(0, 9*256/16, 7*352/22, 7*256/16);
    NsccRectangle whiteBlockC;
    whiteBlockC= new NsccRectangle(9*352/22, 0, 13*352/22, 7*256/16);
    NsccRectangle whiteBlockD;
    whiteBlockD = new NsccRectangle(9*352/22, 9*256/16, 13*352/22, 7*256/16);
    NsccRectangle redBlockA;
    redBlockA = new NsccRectangle(0, 0, 6*352/22, 6*256/16);
    NsccRectangle redBlockB;
    redBlockB = new NsccRectangle(0, 10*256/16, 6*352/22, 6*256/16);
    NsccRectangle redBlockC;
    redBlockC = new NsccRectangle(10*352/22, 0, 12*352/22, 6*256/16);
    NsccRectangle redBlockD;
    redBlockD = new NsccRectangle(10*352/22, 10*256/16, 12*352/22, 12*256/16);
    // add shapes to the window
    win.add(flag);
    flag.add(whiteBlockA);
    flag.add(whiteBlockB);
    flag.add(whiteBlockC);
    flag.add(whiteBlockD);
    flag.add(redBlockA);
    flag.add(redBlockB);
    flag.add(redBlockC);
    flag.add(redBlockD);
    // color the shapes
    flag.setFilled(true);
    whiteBlockA.setFilled(true);
    whiteBlockB.setFilled(true);
    whiteBlockC.setFilled(true);
    whiteBlockD.setFilled(true);
    redBlockA.setFilled(true);
    redBlockB.setFilled(true);
    redBlockC.setFilled(true);
    redBlockD.setFilled(true);
    flag.setBackground(Color.blue);
    redBlockA.setBackground(Color.red);
    redBlockB.setBackground(Color.red);
    redBlockC.setBackground(Color.red);
    redBlockD.setBackground(Color.red);
    win.repaint();
  }
  
  /*
   * Application method to draw each flag
   * 
   * @param args The command-line arguments
   */
  public static void main(String[] args) {
    Flags test = new Flags();
    test.drawNigerFlag();
    test.drawSwedenFlag();
    test.drawNorwayFlag();
  }
}