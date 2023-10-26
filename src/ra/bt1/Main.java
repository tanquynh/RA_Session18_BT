package ra.bt1;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator1 = new NumberGenerator(Thread.MAX_PRIORITY);
        NumberGenerator generator2 = new NumberGenerator(Thread.MIN_PRIORITY);

        Thread thread1 = new Thread(generator1);
        Thread thread2 = new Thread(generator2);

        thread1.start();
        thread2.start();

    }
}
