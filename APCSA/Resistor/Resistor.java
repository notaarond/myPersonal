//091219 Aaron De Castro
import java.util.Random;

public class Resistor{

  //states
  private int nomR; //nominal resistance
  private double tol; //tolerance
  private int actR; //actual resistance

  //constructor with parameters for nomR and tol
  public Resistor(int r, double t)
  {
    nomR = r;
    tol = t;

    //((1 - tol)* nomR) >= actual resistance <=  ((1 + tol) * nomR)
    //Random object.nextInt(limit) returns values within 0 and limit
    //objectRand.nextInt((2 * (int)(tol * nomR)) + 1 ) gives difference between lower and upper limit then adds 1 since upper bound is exclusive(doesn't include upper bound number)
    //"                                       " + ((1-tol) * nomR) sets diff, then sets it to lowest value to obtain true bounds

    Random randNum = new Random();
    actR = randNum.nextInt((2 * (int)(tol * nomR)) + 1) + (int)((1 - tol) * nomR);
  }

  //set methods
  public void setNomRes(int r) { nomR = r; }
  public void setTol(double t) { tol = t; }

  //get methods
  public int getNomRes() { return nomR; }
  public double getTol() { return tol; }
  public int getActRes() { return actR; }

  //helper methods
  public String colorCode()//method for outputting the bands
  {
    String output = ""; //output String that cases can concatenate to
    String resistance = Double.toString((double)this.getNomRes()); //sets the nomRes to a String and double type for setting up for double implementation

    //output += resistance; //ignore, test code

    // first two band checks
    for(int i = 0; i < 2; i++) //Resistors only have values up to their second digit, iterates through first
    {
      //if(i == 0 || i == 1) { output += resistance; } //ignore, test code

      if(resistance.charAt(i) == '.' || (resistance.charAt(0) == '0' && resistance.charAt(i) == '0')){
        i--;
        continue;
      }
      //first part skips decimal points to read part whole and part decimal numbers
      //second part is able to detect if number is a pure decimal, i.e. 0.29, 0.98, 0.10, and accounts for that

      //these simply check the numbers and add their color to be outputted
      if(resistance.charAt(i) == '0'){ output += "Black | "; }
      if(resistance.charAt(i) == '1'){ output += "Brown | "; }
      if(resistance.charAt(i) == '2'){ output += "Red | "; }
      if(resistance.charAt(i) == '3'){ output += "Orange | "; }
      if(resistance.charAt(i) == '4'){ output += "Yellow | "; }
      if(resistance.charAt(i) == '5'){ output += "Green | "; }
      if(resistance.charAt(i) == '6'){ output += "Blue | "; }
      if(resistance.charAt(i) == '7'){ output += "Violet | "; }
      if(resistance.charAt(i) == '8'){ output += "Grey | "; }
      if(resistance.charAt(i) == '9'){ output += "White | "; }
    }

    //third band checks

    if(this.getNomRes() < 10){ output += "Black |"; }
    //at time of writing, lowest possible resis value is 1, so all resis values below 10 have to black bands
    //I understand there are Gold and Silver multipliers, but those need further implementation

    //depending on multiplier, res value will have a specific number of characters
    //ex. nomRes = 10, 10 is a brown band(1.0 x 10^1), 10 == 10.0, 10.0 has 4 chars, resistance.length() == 4
    //specific length correlates to a color band, following code adds color to be outputted
    if(resistance.length() == 4){ output += "Brown |"; }
    if(resistance.length() == 5){ output += "Red |"; }
    if(resistance.length() == 6){ output += "Orange |"; }
    if(resistance.length() == 7){ output += "Yellow |"; }
    if(resistance.length() == 8){ output += "Green |"; }
    if(resistance.length() == 9){ output += "Blue |"; }
    if(resistance.length() == 10){ output += "Violet |"; }
    if(resistance.length() == 11){ output += "Gray |"; }
    if(resistance.length() == 12){ output += "White |"; }


    //Tolerance checks
    //basic if statements for each of the possible tolerance values given in the problem
    if(this.getTol() == 0.01){ output += " Brown"; }
    if(this.getTol() == 0.02){ output += " Red"; }
    if(this.getTol() == 0.005){ output += " Green"; }
    if(this.getTol() == 0.0025){ output += " Blue"; }
    if(this.getTol() == 0.001){ output += " Violet"; }
    if(this.getTol() == 0.0005){ output += " Gray"; }
    if(this.getTol() == 0.05){ output += " Gold"; }
    if(this.getTol() == 0.1){ output += " Silver"; }
    if(this.getTol() == 0.2){ output += " None"; }


    return output;
  }

  public String toString(){
    String output = "Nominal Resistance: " + nomR +
                    "\nTolerance: " + tol +
                    "\nActual Resistance: " + actR;

    return output;
  }

}
