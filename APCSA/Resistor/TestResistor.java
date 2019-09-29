//Aaron De Castro 091719

public class TestResistor{
  public static void main(String[] args) {

    Resistor rOne = new Resistor(3400, 0.05);
    Double doub = new Double(9.0);

    System.out.println(rOne.getNomRes());
    System.out.println(rOne.getTol());
    System.out.println(rOne.getActRes());

    System.out.println(rOne.colorCode());

    System.out.println(7.0);
    System.out.println(doub);

  }
}
