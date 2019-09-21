// 092019 Aaron De Castro

public class BAStub{
  public static void main(String[] args) {
    BankAccount accOne = new BankAccount("Aaron", 1250.50);

    System.out.println(accOne.getOwnerName());
    System.out.println(accOne.getBalance());

    System.out.println(accOne.toString());

    accOne.deposit(1000.0);
    System.out.println(accOne.getBalance());

    accOne.withdraw(250.0);
    System.out.println(accOne.getBalance());

    System.out.println(accOne.toString());

  }
}
