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

  public void setNomRes(int r) { nomR = r; }
  public void setTol(double t) { tol = t; }

  public int getNomRes() { return nomR; }
  public double getTol() { return tol; }
  public int getActRes() { return actR; }

}
