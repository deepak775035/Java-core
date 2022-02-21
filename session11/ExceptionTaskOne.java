package session11;

class MathUtils {

    private MathUtils(){

    }

  //-------------------------------------------------------------
  // Returns the factorial of the argument given
  //-------------------------------------------------------------
  public static int factorial(int n) throws IllegalArgumentException {
    
    if(n>16) throw new IllegalArgumentException("Number is greater than int limit");
    if(n<0) throw new IllegalArgumentException("Number is negative");
    
    int fac = 1;
    for (int i = n; i > 0; i--) fac *= i;
    return fac;
  }
}

public class ExceptionTaskOne {

  public static void main(String[] args) {
    int num = 3;

    try {
        
        int ans=MathUtils.factorial(num);
        System.out.println("factorial is "+ ans);
    } catch (IllegalArgumentException e) {
       System.out.println(e);
    }

  }
}
