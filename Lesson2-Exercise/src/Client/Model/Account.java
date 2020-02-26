package Client.Model;

public class Account
{
  private String accountNo;
  private String password;
  private double deposit;

  public Account(String accountNo,String password,double deposit){
    this.accountNo = accountNo;
    this.password = password;
    this.deposit = deposit;
  }

  public String getAccountNo()
  {
    return accountNo;
  }

  public String getPassword()
  {
    return password;
  }

  public double getDeposit()
  {
    return deposit;
  }

  public void setDeposit(double deposit)
  {
    this.deposit = deposit;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }

  public void setAccountNo(String accountNo)
  {
    this.accountNo = accountNo;
  }
}
