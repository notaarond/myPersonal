import java.util.Scanner;

public class TestStudent{

   public static void main (String[] args){
      Student s1, s2, s3;
      String str;
      Scanner reader = new Scanner(System.in);
      String name;

      // --------------------------- Testing Scanner Class ------------------------------ //

      s1 = new Student();     // Instantiate a student object
      System.out.print("Enter the first student's name: ");
      name = reader.next();
      s1.setName(name);    // Set the student's name to name from Scanner

      for(int i = 0; i < 3; i++){ //for loop for setting Student's test scores
        int score;
        System.out.print("Enter " + s1.getName() + "'s score #" + (i + 1) + " : " );
        score = reader.nextInt(); //takes in an int input from the user
        s1.setScore(i + 1, score);
      }

      System.out.println("\nHere is student s1\n" + s1);


      // --------------------------------- Validating new Constructors ---------------------------------------- //

      //Constructor with parameters of strings and ints (without using mutator methods)
      s2 = new Student("Ann", 89, 97, 92);
      System.out.println("\nHere is student s2\n" + s2.getName());
      System.out.println("Her test scores are: " + s2.getScore(1) + " " + s2.getScore(2) + " " + s2.getScore(3));

      //Constructors with another Student object as parameter
      s3 = new Student(s2);
      System.out.println("\nHere is student s3\n" + s3.getName());
      System.out.println("Her test scores are: " + s3.getScore(1) + " " + s3.getScore(2) + " " + s3.getScore(3));

      // ----------------------- Validation of separate references to objects ---------------------------------- //
      s3.setName("Alexandra");
      System.out.println("s3 got a name change and is now: " + s3.getName());
      System.out.println("While s2 is still: " + s2.getName());

      //Testing validateData method

      //s3 is fully initialized with a name and test scores, should output "s3 is all good"
      String result = s3.validateData();
      if (result == null)
      {
        System.out.println("s3 is all good!\n");
      }
      else
      {
        System.out.println(result);
        System.out.println("\n");
      }

      //s4 is instantiated with no name and standard values
      Student s4 = new Student();
      s4.setScore(1, -5); //s4 is given a test score that is invalid

      //s4 has no name and an invalid test score, should report both of those cases
      result = s4.validateData();
      if (result == null)
      {
        System.out.println("s4 is all good!");
      }
      else
      {
        System.out.println(result);
      }

   }
}
