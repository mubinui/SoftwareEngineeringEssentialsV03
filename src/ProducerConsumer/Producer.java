package ProducerConsumer;

public class Producer extends Thread{
    Company c ;
    public Producer(Company c ){
        this.c = c;

    }
    @Override
    public void run() {
        int i = 1;
        while (true){
            try {
                this.c.produced_item(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
           i++;

        }

    }
}
