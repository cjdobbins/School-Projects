public class EchoArgs {
  
  public static void main(String[] args) {
    
    System.out.println("Hello world");
    
    System.out.println("There are " + args.length + " command-line arguments.");
  
    for(int i = 0; i < args.length; i ++) {
      System.out.println("  args[" + i + "] is " + args[i]);
    }

/*
    // Here is an alternate implementation using the for-each loop.
    for(String name : args) {
      System.out.println("  arg is " + name);
    }
*/
    
  }
  
}