//AaDeCa 082319
//trying something with this
import java.util.Scanner;
import java.lang.String;

public class ID
{
  public static void main(String[] args)
  {
    //Program Variables
    Scanner userIn = new Scanner(System.in);
    int arrayMax = 5;
    IDHolder[] people = new IDHolder[arrayMax];
    int namesCounter = 0;
    int decide = 1;

    System.out.println("||| Welcome to the ID 'Database'! |||\n");

    //Name Entry Algorithm
    do
    {
      //escape statement for maxed out array
      if(namesCounter == arrayMax)
      {
        System.out.println("That's the limit of names you can enter!");
        break;
      }

      //Takes in user input via scanner and uses it to initialize array items
      System.out.print("Enter your name: ");
      String name = userIn.next();
      people[namesCounter] = new IDHolder(name); //creates a new IDHolder object that takes in user input into its constructor
      namesCounter++;

      //1 = input more names, 0 = end do-while, input must be 1 or 0
      //needs to be fixed so that only 1 or 0 can be used
      System.out.print("Will you enter more names, limit is 5?(Y = 1/N = 0): ");
      decide = userIn.nextInt();

      //if-statement that decides if the do-while statement runs again(removed for simplicity)

    } while (decide == 1);


    System.out.print(people[0].getName());

  }
}
