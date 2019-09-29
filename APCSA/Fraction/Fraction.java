//091319 Aaron De Castro #216026
import java.util.Scanner;

public class Fraction
{
  //states, protected for access by child MixedNumber
  protected int numerator;
  protected int denominator;

  //Constructor with rejection algorithm for undefined fractions( number divided by 0 )
  public Fraction(int n, int d)
  {
    int anotherD = d; //set placeholder var for d
    numerator = n;

    //if passed denom. = 0, don't set denom. to 0, wait till user inputs a legal input
    //while loop used so that code repeats until legal value is passed and so that code does not run if legal input initially passed
    while(anotherD == 0){
      System.out.println("Please enter a denominator that is not 0: ");
      Scanner input = new Scanner(System.in);
      anotherD = input.nextInt();
    }

    denominator = anotherD;
  }

  //behaviors: get/set and helper methods should be add, subtract, multiply, and divide

  //accessor methods
  public int getNumerator() { return numerator; }
  public int getDenominator() { return denominator; }

  //mutator methods
  public void setNumerator(int n) { numerator = n; }
  public void setDenominator(int d) { denominator = d; }

  //helper methods
  //implemented math functions to how book advised to add and subtract fractions
  public Fraction add(Fraction f)
  { //(n1*d2) + (n2*d1)/(d1*d2)
    int newNum = (numerator * f.getDenominator()) + (f.getNumerator() * denominator);
    int newDen = (denominator * f.getDenominator());

    //Instantiate new Fraction object with calculated numerator and denominator
    Fraction sum = new Fraction(newNum, newDen);
    return sum;
  }

  public Fraction subtract(Fraction f)
  {//(n1*d2) - (n2*d1)/(d1*d2)
    int newNum = (numerator * f.getDenominator()) - (f.getNumerator() * denominator);
    int newDen = (denominator * f.getDenominator());

    //Instantiate new Fraction object with calculated numerator and denominator
    Fraction sum = new Fraction(newNum, newDen);
    return sum;
  }

  public Fraction multiply(Fraction f)
  { //(n1*n2) / (d1*d2)
    int newNum = (numerator * f.getNumerator());
    int newDen = (denominator * f.getDenominator());

    //Instantiate new Fraction object with calculated numerator and denominator
    Fraction sum = new Fraction(newNum, newDen);
    return sum;
  }

  public Fraction divide(Fraction f)
  { //(n1*d2) / (d1*n2)
    int newNum = (numerator * f.getDenominator());
    int newDen = (denominator * f.getNumerator());

    //Instantiate new Fraction object with calculated numerator and denominator
    Fraction sum = new Fraction(newNum, newDen);
    return sum;
  }

  public Fraction doubleFrac(){

    return this.add(this);

  }
  //public Fraction simplify(){}

  public String toString()
  {
    String str;
    str = "Numerator: " + numerator +
          "\nDenominator: " + denominator;

    return str;
  }

}
