/**
 * This class adds positive integer inputs from the command
 * line and ignores all other inputs
 * 
 * @author CJ Dobbins
 * @version Assignment 8: Addition
 * @version Standard
 */
public class Addition {

  /**
   * Method to check for bad input
   * 
   * @param s String to check for digits
   * @return boolean
   */
  private static boolean badInput(String s) {
    boolean bad = false;
    for(int i = 0; i < s.length(); i++) {
      if(Character.isDigit(s.charAt(i)) == false) {
        bad = true;
      }
    }
    return bad;
  }
  /**
   * Application method for adding together the string
   * arguments from the command line
   * 
   * @param args The command line arguments, anything that
   * is not a positive integer will be ignored
   */
  public static void main(String[] args) {
    //badArgs is used to count the number of invalid arguments
    int badArgs = 0;
    //value accumulates the value of acceptable inputs
    int value;
    //initializing the loop
    //if we have good input the initial value is set to
    //the first command line argument and is printed
    if(badInput(args[0]) == false) {
      value = Integer.parseInt(args[0]);
      System.out.print(args[0]);
    //if we have bad input the initial value is set to 0
    //and we count 1 bad argument
    } else {
      value = 0;
      badArgs ++;
    }
    //loop for adding the command args
    for(int i = 1; i < args.length; i++) {
      //each arg is check for validity and added if
      //it is valid
      if(badInput(args[i]) == false) {
        value += Integer.parseInt(args[i]);
        //if i is equal to badArgs our initial fencepost
        //was broken.  This if statement repairs
        //the fence
        if(i == badArgs) {
          System.out.print(args[i]);
        } else {
          System.out.print(" + " + args[i]);
        }
      } else {
        badArgs++;
      }
    }
    //print the value of the added arguments
    System.out.println(" = " + value);
    //if we had any bad arguments they will be
    //printed here
    if(badArgs > 0) {
      System.out.print("Ignored arguments: ");
      for(int i = 0; i < args.length; i++) {
        if(badInput(args[i])) {
          System.out.print(args[i] + " ");
        }
      }
    }
  }  
}