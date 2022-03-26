package classFolder.session4.morning;

public class TwoLoops {
    public static void main(String[] args) {
        

        int sum=0;
        for (int i = 1; i < 10; i++) {
            sum+=i;
            System.out.println(sum);
        }

        int sum2=0;
        for (int i = 1; sum2 <= 100; i++) {
            sum2+=i;
        }
        System.out.println(sum2);
    }
}
