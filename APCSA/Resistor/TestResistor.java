//Aaron De Castro 091719

public class TestResistor{
  public static void main(String[] args) {

    Resistor rOne = new Resistor(1000, 0.05);

    System.out.println(rOne.getNomRes());
    System.out.println(rOne.getTol());
    System.out.println(rOne.getActRes());
    
  }
}
