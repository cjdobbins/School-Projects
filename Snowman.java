import java.awt.Color;
/**
 * Thise method creates a window and draws
 * a snowman within that window.
 */
public class Snowman {
  /**
   * This is a simple class to build a snowman.
   * 
   * @author CJ Dobbins
   * @version Demo 4: Building a Snowman
   */
  public void show() {
    // create the window for the snowman, set the title
    NsccWindow win;
    win = new NsccWindow(75, 50, 160, 250);
    win.setTitle("My Snowman");
    //declare variables for the head and body
    NsccEllipse head;
    NsccEllipse body;
    // create the head and body
    head = new NsccEllipse();
    body = new NsccEllipse();
    // add them to the window
    win.add(head);
    win.add(body);
    // set the size and location
    head.setSize(50, 50);
    body.setSize(100, 100);
    body.setLocation(25, 25 + 50);
    head.setLocation(75 - 25, 25);
    // set the Filled property to make them white
    head.setFilled(true);
    body.setFilled(true);
    //declare variables for the face
    NsccUpTriangle leftEye;
    NsccUpTriangle rightEye;
    NsccUpTriangle nose;
    // instantiate the eyes and add to the window
    leftEye = new NsccUpTriangle(75-10-4, 25+15, 10, 10);
    rightEye = new NsccUpTriangle(75+4, 25+15, 10, 10);
    win.add(leftEye);
    win.add(rightEye);
    //instantiate the nose and add to the head
    nose = new NsccUpTriangle(25-5, 15+10+3, 10, 10);
    head.add(nose);
    // color the outlines of the eyes
    leftEye.setForeground(Color.green);
    rightEye.setForeground(Color.green);
    // color the insides of the eyes
    leftEye.setFilled(true);
    rightEye.setFilled(true);
    leftEye.setBackground(Color.blue);
    rightEye.setBackground(Color.blue);
    // create a custom color for the nose
    Color lightBlue = new Color(196, 196, 255);
    nose.setFilled(true);
    nose.setBackground(lightBlue);
    // request a repaint for the whole window
    win.repaint();
  }
  /**
   * The application method to create a snowman.
   * 
   * @param args The command-line arguments
   */
  public static void main(String[] args) {
    Snowman frosty;
    frosty = new Snowman();
    frosty.show();
  }
}