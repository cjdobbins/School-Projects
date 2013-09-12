/**
 * This is the starting point code for Lab 12.
 */
public class Reindeer {

  // The reindeer
  private java.util.Collection<String> reindeer;
  
  /**
   * Constructor, which you will write
   */
  public Reindeer() {
    reindeer = new java.util.ArrayList<String>();
  }
 
  /**
   * Add the names of the reindeer to the collection.
   */
  public void addReindeer() {
    reindeer.add("Dasher");
    reindeer.add("Dancer");
    reindeer.add("Prancer");
    reindeer.add("Vixen");
    reindeer.add("Comet");
    reindeer.add("Cupid");
    reindeer.add("Dunder");
    reindeer.add("Blixem");
  }
  
  /**
   * A simple method to print out the contents of
   * the collection.
   */
  public void print() {
    for(Object o : reindeer) {
      System.out.print(o + " ");
    }
    System.out.println();
  }
  
  /**
   * The application method, which you will write
   * @param args Command-line arguments
   */
  public static void main(String[] args) {
    Reindeer deer = new Reindeer();
    deer.addReindeer();
    deer.print();
    deer.reindeer = new java.util.LinkedList<String>();
    deer.addReindeer();
    deer.print();
    deer.addReindeer();
    deer.print();
    deer.reindeer = new java.util.HashSet<String>();
    deer.addReindeer();
    deer.print();
    deer.addReindeer();
    deer.print();
  }
  
}
