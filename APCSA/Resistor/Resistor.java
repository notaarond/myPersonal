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

    //((1 - tol)* nomR) >= actual resistance <=  ((1 + tol) * nomR), so...

    

  }

  public void setNomRes(int r) { nomR = r; }
  public void setTol(double t) { tol = t; }

  public int getNomRes() { return nomR; }
  public double getTol() { return tol; }
  public int getActRes() { return actR; }

}
