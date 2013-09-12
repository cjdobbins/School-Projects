/**
 * Class implements the Sieve interface and finds all
 * prime numbers up to a specified bound using the Sieve
 * of Eratosthenese algorithm
 * 
 * @author CJ Dobbins
 * @version Assignment 9: Sieve of Eratosthenes
 * @version Standard
 */
public class Primes implements Sieve {
  //Create variables to be used by the sieve
  private java.util.List<Integer> numberList;
  private java.util.Iterator<Integer> it;
  private int currentPrime;
  private int testPrime;
  
  /**
   * Method for implementing the Sieve interface
   * 
   * @param n Upper bound
   * @return numberList A LinkedList containing all prime
   * @return numbers up to the specified bound
   */
  public java.util.List<Integer> getPrimes(int n) {
    //Instantiate a new LinkedList ** Did not complete the challenge
    //                             ** but got far enough to see LinkedList
    //                             ** is faster
    numberList = new java.util.LinkedList<Integer>();
    double m = Math.sqrt(n);
    //add all numbers to the list up to the specified bound
    for(int i = 2; i <= n; i++) {
      numberList.add(i);
    }
    //Setup the iterator to run through the list
    it = numberList.iterator();
    currentPrime = numberList.get(0);
    //loop to weed out all non-prime numbers
    for(int i = 0; currentPrime <= m; i++) {
      //iterator runs through each value left in the list
      while(it.hasNext()) {
        testPrime = it.next();
        //if the number tested is evenly divisible by the current prime
        //then it is not prime and will be removed from the list
        if(testPrime % currentPrime == 0 && testPrime > currentPrime) {
          it.remove();
        }
      }
      //get the next prime number from the list
      currentPrime = numberList.get(i + 1);
      //reset the iterator for the next run through the loop
      it = numberList.iterator();
    }
    return numberList;    
  }
  
}