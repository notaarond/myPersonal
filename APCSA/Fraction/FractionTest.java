//091219 Aaron De Castro
import java.util.Scanner;

public class FractionTest
{
  public static void main(String[] args) {

    //Instantiate first fraction class, Scanner object, and user values
    Fraction f1 = new Fraction(1, 2);
    Scanner userInput = new Scanner(System.in);
    int userNum, userDen;

    //User inputs Numerator
    System.out.println("Please enter a numerator: ");
    userNum = userInput.nextInt();

    //User inputs denominator
    System.out.println("Please enter a denominator: ");
    userDen = userInput.nextInt();

    //Instantiate new fraction object based on user's inputs
    Fraction f2 = new Fraction(userNum, userDen);

    //Displays the fractions to be manipulated first
    System.out.println("Fraction 1: \n" + f1);
    System.out.println("\nFraction 2: \n" + f2);

    //Testing math methods on Fraction objects
    System.out.println("\nAdding both: \n" + f1.add(f2));
    System.out.println("\nSubtracting both: \n" + f1.subtract(f2));
    System.out.println("\nMultiplying both: \n" + f1.multiply(f2));
    System.out.println("\nDividing both: \n" + f1.divide(f2));
  }
}
