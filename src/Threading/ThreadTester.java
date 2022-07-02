package Threading;

public class ThreadTester {
    public static void main(String[] args) throws InterruptedException {
        //***************Main Thread********************
        Thread tmain = Thread.currentThread();
        String tname = tmain.getName();
        System.out.println("Current thread is "+ tname);

        //*******************MyThread*******************
        Thread thread = new Thread(new MyThread());
        thread.start();
        Thread thread1 = new Thread(new MyThread());
        thread1.start();
        thread1.wait(100);
        System.out.println(thread1.getName());
        System.out.println(thread.getName());
        //******************* Thread Extended ***********
        MyThreadEx x = new MyThreadEx();
        x.start();
        x.setName("GOOD BOY");
        System.out.println(x.getId());

    }
}
