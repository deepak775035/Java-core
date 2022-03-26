package classFolder.session7;

class BankAccount {

  int accNo;
  String accHolderName;
  double accBalance;

  public BankAccount(int accNo, String accHolderName, double accBalance) {
    this.accNo = accNo;
    this.accHolderName = accHolderName;
    this.accBalance = accBalance;
  }

  @Override
  public String toString() {
    return "BankAccount [accBalance=" + accBalance + ", accHolderName=" + accHolderName + ", accNo=" + accNo + "]";
  }

  public int getAccNo() {return accNo;}
  public void setAccNo(int accNo) {this.accNo = accNo;}
  public String getAccHolderName() {return accHolderName;}
  public void setAccHolderName(String accHolderName) {this.accHolderName = accHolderName;}
  public double getAccBalance() {return accBalance;}
  public void setAccBalance(double accBalance) {this.accBalance = accBalance;}

  public void additionalFeatures() {
    //for extra Features to be implemented down the line
  }

  public static BankAccount copyAccounts(BankAccount obj) {
    return new BankAccount(obj.getAccNo(),obj.getAccHolderName(),obj.getAccBalance());
  }

  BankAccount getStatement(){
    System.out.println(" Name:"+accHolderName+" AccountType: "+ this.getClass().getSimpleName());
    return this;
  }

}///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class SavingsAccount extends BankAccount {

  // In monthly Percent
  double rateOfInterest;

  public SavingsAccount(int accNo,String accHolderName,double accBalance,double rateOfInterest) {
    super(accNo, accHolderName, accBalance);
    this.rateOfInterest = rateOfInterest;
  }

  double getYearlyInterest() {return getComputedInterest(1);}
  double getComputedInterest(int years) {
    double p = accBalance;
    double r = this.getYearlyInterest();
    int t = years;
    return p * r * t / 100;
  }

  public double getRateOfInterest() {return rateOfInterest;}
  public void setRateOfInterest(double rateOfInterest) {this.rateOfInterest = rateOfInterest;}

  @Override
  SavingsAccount getStatement() {
    System.out.println("Name:"+accHolderName+" AccountType:"+ this.getClass().getSimpleName());
    return this;
  }

  

}/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class CurrentAccount extends BankAccount {

  double avgDailyTransaction;
  double getYearlyTransaction() {return getTotalTransactionAmount(365);}
  double getTotalTransactionAmount(int days) { return avgDailyTransaction * days;}

  public CurrentAccount(int accNo,String accHolderName,double accBalance,double avgDailyTransaction) {
    super(accNo, accHolderName, accBalance);
    this.avgDailyTransaction = avgDailyTransaction;
  }

  public double getAvgDailyTransaction() {  return avgDailyTransaction; }
  public void setAvgDailyTransaction(double avgDailyTransaction) { this.avgDailyTransaction = avgDailyTransaction;}
  
  @Override
  CurrentAccount getStatement() {
    System.out.println("Name:"+accHolderName+" AccountType:"+ this.getClass().getSimpleName());
    return this;
  }
}///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



public class BankAccountDriver {

  public static void main(String[] args) {
{
    // BankAccount salaryAccounts = new BankAccount(99922, "Jhon", 3000) {
    //   double salary = 10000;
    //   double pfAmount = 2000;
    //   double incomeTaxRate = 5;

    //   @Override
    //   public void additionalFeatures() {
    //     System.out.println("Yearly Tax=" + getYearlyTax());
    //     System.out.println("In Hand Salary=" + getInHandSalary());
    //   }

    //   @Override
    //   public String toString() {
    //     return "SalaryAccount  [" + super.toString();
    //   }

    //   double getYearlyTax() {
    //     return ((salary - pfAmount) * 12) * incomeTaxRate / 100;
    //   }

    //   double getInHandSalary() {
    //     return salary - pfAmount - getYearlyTax() / 12;
    //   }
    // };

    }   
   
    BankAccount bankAccount = new BankAccount(501, "Trevor", 900000);
    SavingsAccount savingsAccount = new SavingsAccount(101, "June", 5000, 5);
    CurrentAccount currentAccount = new CurrentAccount(201, "Alice", 4000, 200);

    bankAccount.getStatement();
    savingsAccount.getStatement();
    currentAccount.getStatement();
   
  }
}
