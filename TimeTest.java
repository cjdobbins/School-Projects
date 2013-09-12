public class TimeTest {
  
  private java.util.List<Integer> numberList;
  private java.util.Iterator<Integer> it;
  private int currentPrime;
  private int testPrime;
  
  public java.util.List<Integer> getPrimes1(int n) {
    numberList = new java.util.ArrayList<Integer> ();
    double m = Math.sqrt(n);
    for(int i = 2; i <= n; i++) {
      numberList.add(i);
    }
    if(numberList.size() == 1) {
      return numberList;
    }
    it = numberList.iterator();
    currentPrime = it.next();
    for(int i = 0; i < m; i++) {
      while(it.hasNext()) {
        testPrime = it.next();
        if(testPrime % currentPrime == 0 && testPrime > currentPrime) {
          it.remove();
        }
      }
      currentPrime = numberList.get(i);
      it = numberList.iterator();
    }
    return numberList;    
  }
  
  public java.util.List<Integer> getPrimes2(int n) {
    numberList = new java.util.LinkedList<Integer> ();
    double m = Math.sqrt(n);
    for(int i = 2; i <= n; i++) {
      numberList.add(i);
    }
    if(numberList.size() == 1) {
      return numberList;
    }
    it = numberList.iterator();
    currentPrime = it.next();
    for(int i = 0; i < m; i++) {
      while(it.hasNext()) {
        testPrime = it.next();
        if(testPrime % currentPrime == 0 && testPrime > currentPrime) {
          it.remove();
        }
      }
      currentPrime = numberList.get(i);
      it = numberList.iterator();
    }
    return numberList;    
  }
  
  public static void main(String[] args) {
    TimeTest test = new TimeTest();
    java.util.List answer;
    long start = System.nanoTime();
    answer = test.getPrimes2(100000);
    long stop = System.nanoTime();
    if(answer.size() > 1229) {
      System.out.println((stop - start)/1000000);
    } else {
      System.out.println("WTF?");
    }
    start = System.nanoTime();
    answer = test.getPrimes1(100000);
    stop = System.nanoTime();
    if(answer.size() > 1229) {
      System.out.println((stop - start)/1000000);
    } else {
      System.out.println("WTF?");
    }
  }
    
}