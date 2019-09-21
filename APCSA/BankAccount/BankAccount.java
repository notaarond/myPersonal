// 20 September 2019 Aaron De Castro

public class BankAccount
{

  private String ownerName;
  private double balance;

  public BankAccount()
  {
    ownerName = "";
    balance = 0.0;
  }

  public BankAccount(String n, double b){
    ownerName = n;
    balance = b;
  }

  public String getOwnerName(){ return ownerName; }
  public double getBalance() { return balance; }

  public void deposit(double a){ balance += a; }
  public void withdraw(double a){ balance -= a; }

  public String toString()
  {
    String output = "Account Owner: " + ownerName +
                    "\nbalance: $" + balance;

    return output;
  }
}
