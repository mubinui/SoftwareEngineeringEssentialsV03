package Threading;

public class MyThread implements Runnable {
    int i = 1;
    public void run(){
        i++;
        System.out.println(i);
        try {
            Thread.sleep(1000);

        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
