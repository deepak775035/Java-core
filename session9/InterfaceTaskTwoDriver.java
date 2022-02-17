package session9;

interface RBI {

    double RATE_OF_INTEREST = 0.04;

    void showBalance();
    double withdraw(double amount);
    double deposit(double amount);
    double calculateYearlyInterest();
}

abstract class GenralAccount implements RBI {

    String accHolderName;
    int accNo;
    double accBalance;

    public abstract void displayFeatures();

    protected GenralAccount(String accHolderName, int accNo, double accBalance) {
        this.accHolderName = accHolderName;
        this.accNo = accNo;
        this.accBalance = accBalance;
    }

    @Override
    public String toString() {
        return "Account Info [accBalance=" + accBalance + ", accHolderName=" + accHolderName + ", accNo=" + accNo + "]";
    }

    @Override
    public void showBalance() {
        System.out.println("Bal:" + accBalance);
    }

    @Override
    public double deposit(double amount) {
        accBalance += amount;
        System.out.println("Added amount:"+amount+"\nTotal balance:"+accBalance);
        return accBalance;
    }

    @Override
    public double withdraw(double amount) {
        if(accBalance<amount) System.out.println("Insufficent Balance");
        else{
            accBalance -= amount;
            System.out.println("Ammount Deducted:"+amount);
            System.out.println("Remaning Balance:"+accBalance);
        }
        return accBalance;
    }

    @Override
    public double calculateYearlyInterest() {
        double yearlyInterest = accBalance * RATE_OF_INTEREST;
        System.out.println("Yearly Intreset:"+yearlyInterest);
        return yearlyInterest;
    }

}

class SBIAccount extends GenralAccount {

    public static final double ACCOUNT_OPENING_BONUS = 500;

    public SBIAccount(String accHolderName, int accNo, double accBalance) {
        super(accHolderName, accNo, accBalance + ACCOUNT_OPENING_BONUS);
    }

    @Override
    public void displayFeatures() {
        System.out.println("SBI Account offers ACCOUNT_OPENING_BONUS of INR:" + ACCOUNT_OPENING_BONUS);
    }

}

class ICICIAccount extends GenralAccount {

    public static final double ADDITIONAL_INTEREST = 0.02;

    public ICICIAccount(String accHolderName, int accNo, double accBalance) {
        super(accHolderName, accNo, accBalance);
    }

    @Override
    public void displayFeatures() {
        System.out.println("ICICI Account offeres additional " + (ADDITIONAL_INTEREST * 100) + " % Interest");
    }

    @Override
    public double calculateYearlyInterest() {
        return super.calculateYearlyInterest() + ADDITIONAL_INTEREST * accBalance;
    }

}

public class InterfaceTaskTwoDriver {
    public static void main(String[] args) {
        SBIAccount sbiAccount = new SBIAccount("Sam", 101, 0);
        ICICIAccount iciciAccount = new ICICIAccount("June", 201, 1000);

        sbiAccount.displayFeatures();
        System.out.println(sbiAccount);
        sbiAccount.deposit(500);
        sbiAccount.calculateYearlyInterest();
        sbiAccount.withdraw(100);
        System.out.println(sbiAccount);

        System.out.println();
        iciciAccount.displayFeatures();
        System.out.println(iciciAccount);
        iciciAccount.deposit(500);
        iciciAccount.calculateYearlyInterest();
        iciciAccount.withdraw(100);
        System.out.println(iciciAccount);
    }
}
