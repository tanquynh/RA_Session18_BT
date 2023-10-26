package ra.bt2;

public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();

        try {
//            sử dụng join() để đảm bảo oddThread được kết thúc trước khi bắt đầu thực thi evenThread
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        evenThread.start();
    }
}
