import java.awt.Color;
/**
 * This class builds a traffic light
 * 
 * @author CJ Dobbins
 * @version Lab 2: Traffic Light
 * @version Plus
 */
public class TrafficLight {
  
  /**
   * This method creates a window and draws
   * a traffic light... Super cool like Method Man
   * from the Wu Tang Clan
   */
   
   public void drawTheLight() {
     
     // create the window
      NsccWindow win;
      win = new NsccWindow(10, 10, 140, 330);
      win.setTitle("Traffic Light");
      
      // create shapes for the traffic light
      NsccRectangle outline;
      outline = new NsccRectangle(20, 20, 90, 250);
      NsccEllipse redLight;
      redLight = new NsccEllipse(10, 10, 70, 70);
      NsccEllipse yellowLight;
      yellowLight = new NsccEllipse(10, 90, 70, 70);
      NsccEllipse greenLight;
      greenLight = new NsccEllipse(10, 170, 70, 70);
      
      // add the shapes to the window
      win.add(outline);
      outline.add(redLight);
      outline.add(yellowLight);
      outline.add(greenLight);
      
      // a traffic light wouldn't work without pretty colors
      Color darkGreen = new Color(0, 128, 0);
      outline.setFilled(true);
      outline.setBackground(Color.lightGray);
      redLight.setFilled(true);
      yellowLight.setFilled(true);
      greenLight.setFilled(true);
      redLight.setForeground(Color.red);
      yellowLight.setForeground(Color.yellow);
      greenLight.setForeground(darkGreen);
      redLight.setBackground(Color.red);
      yellowLight.setBackground(Color.yellow);
      greenLight.setBackground(darkGreen);
      win.repaint();
      
   }
   
   /**
    * The application method to create the traffic light.
    * 
    * @param args The command-line arguments
    */   
   public static void main(String[] args) {
     TrafficLight light;
     light = new TrafficLight();
     light.drawTheLight();
   }
   
}