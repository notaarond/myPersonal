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
    String[] names = new String[5];
    int namesCounter = 0;
    int decide = 1;

    System.out.println("Welcome to the ID 'Database'!");

    //Name Entry Algorithm
    do
    {
      if(namesCounter == 5)
      {
        System.out.println("That's the limit of names you can enter!");
        break;
      }

      //Takes in user input via scanner and uses it to initialize array items
      System.out.print("Enter your name: ");
      names[namesCounter] = userIn.next();
      namesCounter++;

      do {
        //1 = input more names, 0 = end do-while, input must be 1 or 0
        //needs to be fixed so that only 1 or 0 can be used
        System.out.print("Will you enter more names, limit is 5?(Y = 1/N = 0): ");
        decide = userIn.nextInt();
      } while ((decide != 0) && (decide != 1));


      //if-statement that decides if the do-while statement runs again(removed for simplicity)

    } while (decide == 1);


    System.out.print("Now, enter ");

  }
}
