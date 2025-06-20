import java.lang.Override;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable 실행 중");

        for (int i = 0; i < 5; i ++) {
            try {
                Thread.sleep(5000);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class SumRunnable implements Runnable {
    private final int[] numbers;

    public SumRunnable(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int sum = 0;

        for (int n : numbers) {
            sum += n;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }

        System.out.println(Thread.currentThread().getName() + " - Sum: " + sum);
    }
}

public class Runnables {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(), "CountThread");
        //thread.start();
        System.out.println(thread.getName());

//        new Thread(()-> {
//            System.out.println("Runnable 실행 중");
//
//            for(int i = 1; i <= 5; i++) {
//                try {
//                    Thread.sleep(5000);
//                } catch(InterruptedException e) {
//                    System.out.println(e.getMessage());
//                }
//            }    // run() -> 하나의 추상메소드만 있으므로 람다식 가능
//        }).start();

        int[][] dataSets = {
                {1, 2, 3, 4, 5},
                {10, 20, 30},
                {7, 14, 21, 28},
                {100, 200, 300, 400}
        };

        for (int i = 0; i < dataSets.length; i++) {
            Thread sumThread = new Thread(new SumRunnable(dataSets[i]));
            sumThread.start();
        }
    }
}
