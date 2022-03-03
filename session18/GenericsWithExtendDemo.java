package session18;

class NumberClass<T extends Number> {

  T num;

  public NumberClass(T num) {
    this.num = num;
  }

  double square() {
    return num.intValue() * num.intValue();
  }

  boolean absEquals(NumberClass<T> obj) {
   return Math.abs((Double)this.num) == Math.abs((Double)obj.num);
  }
}

public class GenericsWithExtendDemo {

  public static void main(String[] args) {
    NumberClass<Double> obj = new NumberClass<>(3.2);
    NumberClass<Double> obj2 = new NumberClass<>(7.0);
    System.out.println(obj.square());
    System.out.println(obj.absEquals(obj2));
    System.out.println(obj.absEquals(obj));

  }
}
