public class TestStudent{

   public static void main (String[] args){
      Student s1, s2, s3;
      String str;
      int i;

      s1 = new Student();     // Instantiate a student object
      s1.setName ("Bill");    // Set the student's name to "Bill"
      s1.setScore (1,84);     // Set the score on test 1 to 84
      s1.setScore (2,86);     //               on test 2 to 86
      s1.setScore (3,88);     //               on test 3 to 88
      System.out.println("\nHere is student s1\n" + s1);


      // Validating new Constructors

      //Constructor with parameters of strings and ints (without using mutator methods)
      s2 = new Student("Ann", 89, 97, 92);
      System.out.println("\nHere is student s2\n" + s2.getName());
      System.out.println("Her test scores are: " + s2.getScore(1) + " " + s2.getScore(2) + " " + s2.getScore(3));

      //Constructors with another Student object as parameter
      s3 = new Student(s2);
      System.out.println("\nHere is student s3\n" + s3.getName());
      System.out.println("Her test scores are: " + s3.getScore(1) + " " + s3.getScore(2) + " " + s3.getScore(3));

      //Validation of separate references to objects
      s3.setName("Alexandra");
      System.out.println("s3 got a name change and is now: " + s3.getName());
      System.out.println("While s2 is still: " + s2.getName());

      //Testing validateData method

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

      Student s4 = new Student();
      //s4.setName("Hi");
      s4.setScore(1, -5);

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
