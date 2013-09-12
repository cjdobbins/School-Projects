/**
 * Driver for the Sieve
 * 
 * @author CJ Dobbins
 * @version Assignment 9: Sieve of Eratosthenes
 * @version Standard
 */
public class SieveDriver{
   
   private java.util.Scanner scan;
   private Sieve theSieve;
   
   /**
    * Constructor for instantiating the scanner and the sieve
    */
   public SieveDriver() {
     scan = new java.util.Scanner(System.in);
     theSieve = new Primes();
   }
     
   /**
    * Method mainly for controlling the flow of the program.
    * Brings all the other methods together to get input
    * and produce output.
    */
   public void go() {
      
      java.util.List<Integer> primes;
      //get input from user
      int n = getNumber();
      //Send upper bound to the sieve
      //unless user inputs 1 or 0
      while(n != 0) {
        if(n != 1) {
          primes = theSieve.getPrimes(n);
          printPrimes(n, primes);
        } else if(n == 1) {
          System.out.println("No Primes!");
        }
        n = getNumber();
      }
      System.out.println("Goodbye!");
   }
   
   /**
    * Method for getting user input
    * 
    * @return int greater than or equal to 0
    */
   public int getNumber() {
      System.out.print("Enter the upper bound or enter 0 to quit: ");
      int n = scan.nextInt();
      while(n < 0) {
        System.out.print("You must enter a non-negative integer or 0 to quit: ");
        n = scan.nextInt();
      }
      return n;
   }
   
   /**
    * Method for printing the list of prime numbers
    * 
    * @param bound upper limit for checking for primes
    * @param list the list of primes
    */
   public void printPrimes(int bound, java.util.List<Integer> list) {
      System.out.println("The primes up to N are:");
      java.util.Iterator<Integer> it = list.iterator();
      int count = 0;
      while(it.hasNext()) {
         System.out.print(it.next() + " ");
         count++;
         if(count == 12) {
           System.out.println();
           count = 0;
         }
      }
      int primes = list.size();
      int percent = 100*primes/bound;
      System.out.println();
      System.out.println(percent + "% of the numbers between 1 and " + bound + " are prime.");
      System.out.println();
      System.out.println();
   }
   
   /**
    * Application method for SieveDriver
    * 
    * @param args The command line arguments
    */
   public static void main(String[] args) {
   
      new SieveDriver().go();
      
   }
   
}