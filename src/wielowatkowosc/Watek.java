package wielowatkowosc;

public class Watek extends Thread {

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
    }
}
