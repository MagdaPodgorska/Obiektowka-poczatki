package wielowatkowosc;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        Watek watek=new Watek();
//        watek.start();
//
//        Watek [] watki=new Watek[10];
//        for (int i = 0; i <10 ; i++) {
//            watki[i]=new Watek();
//        }
//        for (int i = 0; i <10 ; i++) {
//            watki[i].start();
//        }

//        Runnable watek2=new Watek2();
//
//        Thread [] watki2=new  Thread[10];
//        for (int i = 0; i <10 ; i++) {
//            watki2[i]=new Thread(watek2);
//        }
//        for (int i = 0; i <10 ; i++) {
//            watki2[i].start();
//        }

        ExecutorService executor = Executors.newFixedThreadPool(10);
        Callable watek3 = new Watek3();
        Future[] futures = new Future[10];
        for (int i = 0; i < 10; i++) {

            futures[i] = executor.submit(watek3);

        }
        for (int i = 0; i < 10; i++) {

            System.out.println(futures[i].get());

        }

    }
}
