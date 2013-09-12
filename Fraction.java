public class Fraction {
  
  private double numer;
  private double denom;
  
  public Fraction(int numerator, int denominator) {
    numer = numerator;
    denom = denominator;
  }
  
  public Fraction() {
    numer = 0;
    denom = 1;
  }
  
  public double getNumerator() {
    return numer;
  }
  
  public double getDenominator() {
    return denom;
  }
  
  public double getValue() {
    return numer/denom;
  }
  
  public String getString() {
    String fraction = "";
    fraction = fraction.concat(numer + "/" + denom);
    return fraction;
  }
  
  public void changeFraction(double numerator, double denominator) {
    numer = numerator;
    denom = denominator;
  }
  
  public double addFraction(double fract1, double fract2) {
    return fract1 + fract2;
  }
  
  public double multiplyFraction(double fract1, double fract2) {
    return fract1*fract2;
  }
  
  public boolean equalFraction(double fract1, double fract2) {
    return fract1 == fract2;
  }
  
}