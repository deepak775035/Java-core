package classFolder.session7;

class Address {

  String state;
  String country;

  public Address(String state, String country) {
    this.state = state;
    this.country = country;
  }

  @Override
  public String toString() {
    return " country=" + country + ", state=" + state;
  }
}

class UPIPaymentsApp implements Cloneable {

  String appName;
  double maxDailyAmount;
  Address add;

  public UPIPaymentsApp(String appName, double maxDailyAmount, Address add) {
    this.appName = appName;
    this.maxDailyAmount = maxDailyAmount;
    this.add = add;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    UPIPaymentsApp upi = (UPIPaymentsApp) super.clone();
    upi.add = new Address(add.state, add.country);
    return upi;
  }

  @Override
  public String toString() {
    return (
      "UPIPaymentsApp [" +
      "appName=" +
      appName +
      ", maxDailyAmount=" +
      maxDailyAmount +
      add +
      "]"
    );
  }
}

public class BhimDriver {

  public static void main(String[] args) throws Exception {
    UPIPaymentsApp BHIM = new UPIPaymentsApp("BHIM",100000,new Address("MH", "IN"));

    UPIPaymentsApp gpay = (UPIPaymentsApp) BHIM.clone();
    gpay.appName = "gpay";
    gpay.maxDailyAmount = 1000;
    gpay.add.country = "USA";
    gpay.add.state = "NY";

    System.out.println(gpay);
    System.out.println(BHIM);
  }
}
