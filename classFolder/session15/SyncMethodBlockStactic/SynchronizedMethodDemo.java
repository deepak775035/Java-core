package classFolder.session15.SyncMethodBlockStactic;

class MethodDisplayTable {
    synchronized void printTable(int n) {

        System.out.println(Thread.currentThread().getName() + " has locked the synchronized Method");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " is releasing the lock");

        System.out.println("Non-synchronized line printed by " +Thread.currentThread().getName());
    }
}

class TestSynchronizedMethod extends Thread {
    MethodDisplayTable table;

    TestSynchronizedMethod(MethodDisplayTable table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(5);
    }
}

public class SynchronizedMethodDemo {
    public static void main(String[] args) {
        MethodDisplayTable table = new MethodDisplayTable();

        TestSynchronizedMethod thread1 = new TestSynchronizedMethod(table);
        TestSynchronizedMethod thread2 = new TestSynchronizedMethod(table);
        TestSynchronizedMethod thread3 = new TestSynchronizedMethod(table);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
