import java.lang.Override;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("My Thread: " + i);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

    }
}
