package ra.bt1;

public class NumberGenerator implements Runnable {
    private int threadPriority;

    public NumberGenerator(int threadPriority) {
        this.threadPriority = threadPriority;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(threadPriority);

        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + " - Number: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
