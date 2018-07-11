package wielowatkowosc;

public class Watek2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId());
    }
}
