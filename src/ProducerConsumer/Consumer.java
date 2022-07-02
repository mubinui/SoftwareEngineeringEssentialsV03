package ProducerConsumer;

public class Consumer extends Thread{
    Company c;
    Consumer(Company c){
        this.c = c;

    }
    @Override
    public void run() {
        int i = 1;
        while (true){
            try {
                this.c.consume_item();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }

    }
}
