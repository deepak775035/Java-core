package classFolder.session15.Normal;


class UsingThreadClass extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5*"+i+"="+(5*i));     
        }

        System.out.println("t1 Terminating");
    }
}


class UsingThreadInterface implements Runnable{
    @Override
    public void run() {
        String[] countriesName = {"India","South-Korea","Thailand","Canada","UAE"};
        for (String string : countriesName) {
            System.out.println(string);
        }
        
        System.out.println("t2 Terminating");
    }
}


public class PrintTableWithThread {
    public static void main(String[] args) {
        System.out.println("Main Thread Running");
        
        UsingThreadClass t1 = new UsingThreadClass();
        UsingThreadInterface interfaceObjT2 = new UsingThreadInterface();
        Thread t2 = new Thread(interfaceObjT2);
        t1.start();
        t2.start();

        System.out.println("Name: Deepak");
        System.out.println("Place: Mars");
        System.out.println("Hobby: Fighting Aliens");
        System.out.println("Main Terminating");
        
    }
}
