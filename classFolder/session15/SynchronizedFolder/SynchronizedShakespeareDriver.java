package classFolder.session15.SynchronizedFolder;



import java.io.FileWriter;

class Shakespeare {

   synchronized void writeEpicStuff(String str){
        try {
            FileWriter myWriter = new FileWriter("session15/SynchronizedFolder/syncOutFile.txt",true);
            myWriter.write(str + " " + Thread.currentThread().getName()+ "\n");
            myWriter.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
    
    }

}

class MyThread extends Thread{
    private String content;
    private Shakespeare shakespeare;
    public MyThread(String content, Shakespeare shakespeare) {
        this.content = content;
        this.shakespeare = shakespeare;
    }
    @Override
    public void run() {
        this.shakespeare.writeEpicStuff(this.content);
    }

}


public class SynchronizedShakespeareDriver {
    public static void main(String[] args) throws InterruptedException {
        Shakespeare s = new Shakespeare();
        MyThread t1 = new MyThread("Et tu Brutus!", s);
        MyThread t2 = new MyThread("Hamlet is a small village", s);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        //to do 5
    }
}
