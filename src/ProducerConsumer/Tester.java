package ProducerConsumer;

public class Tester {
    public static void main(String[] args) {
        Company com = new Company();
        Producer p = new Producer(com);
        Consumer c = new Consumer(com);
        p.start();
        c.start();
    }
}
