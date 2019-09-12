//091219 AaDeCa

public class Fraction
{
  //states
  private int numerator;
  private int denominator;

  //Constructor

  public Fraction(int n, int d)
  {
    numerator = n;
    denominator = d;
  }

  //behaviors: get/set and should be

  //accessor methods
  public int getNumerator() { return numerator; }
  public int getDenominator() { return denominator; }

  //mutator methods
  public void setNumerator(int n) { numerator = n; }
  public void setDenominator(int d) { denominator = d; }

  //helper methods
  public Fraction add(Fraction f)
  {
    int newNum = (numerator * f.getDenominator()) + (f.getNumerator() * denominator);
    int newDen = (denominator * f.getDenominator());

    Fraction sum = new Fraction(newNum, newDen);
    return sum;
  }

  public String toString()
  {
    String str;
    str = "Numerator: " + numerator +
          "\nDenominator: " + denominator;

    return str;
  }

}
