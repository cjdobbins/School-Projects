/**
 * This class prints the names of the seven dwarves
 * using a for loop and a while loop with an iterator
 * 
 * @author CJ Dobbins
 * @version: Lab 11: Dwarves
 * @version: Check
 */
public class Dwarves {

  // The collect to hold the names
  private java.util.ArrayList<String> dwarves;
  
  /**
   * Zero parameter constructor for instantiating
   * the array list
   */
  public Dwarves() {
    dwarves = new java.util.ArrayList<String>();
  }
  
  /**
   * Add the names of the dwarves to the collection.
   */
  public void addNames() {
    add("Doc");
    add("Grumpy");
    add("Happy");
    add("Sleepy");
    add("Bashful");
    add("Sneezy");
    add("Dopey");
  }
  
  /**
   * Add a single name to the collection
   * @param name The name to be added
   */
  public void add(String name) {
     dwarves.add(name);
  }
  
  /**
   * A simple method to print out the contents of
   * the collection, using the for loop.
   */
  public void print() {
    System.out.println("Print out the list using a for loop:");
    for(String name : dwarves) {
      System.out.print(name + " ");
    }
    System.out.println();
  }

  /**
   * A second method to print out the contents of
   * the collection, using an Iterator.
   */
  public void print2() {
    System.out.println("Print out the list using an Iterator:");
    java.util.Iterator<String> it = dwarves.iterator();
    while(it.hasNext()) {
      System.out.print(it.next() + " ");
    }
    System.out.println();
  }

  /**
   * The application method
   * @param args Command-line parameters
   */
  public static void main(String[] args) {
     // instantiate the Dwarves class
     Dwarves theGuys = new Dwarves();
     theGuys.addNames();
     theGuys.print();
     theGuys.print2();
  }
  
}

