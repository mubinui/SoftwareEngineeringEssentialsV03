package Threading;

public class ThreadTester {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();



    }
}
