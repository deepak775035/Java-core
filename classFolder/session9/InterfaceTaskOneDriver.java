package classFolder.session9;

import java.util.Arrays;

interface in1 {
    void display(int p);
}

class TestClass implements in1 {

    private int countPrimeNumbers(int n) {
        Boolean[] primeArr = new Boolean[n];
        Arrays.fill(primeArr, true);

        int count = 0;
        for (int i = 2; i * i < n; i++) {
            if (primeArr[i])
                for (int j = i * i; j < n; j += i)
                    primeArr[j] = false;
        }
        for (int i = 2; i < n; i++)
            if (primeArr[i])
                count++;

        return count;
    }

    @Override
    public void display(int p) {
        System.out.println(countPrimeNumbers(p+1));
    }

}

public class InterfaceTaskOneDriver {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.display(13);
        testClass.display(19);
    }
}
