package wielowatkowosc;

import java.util.concurrent.Callable;

public class Watek3 implements Callable {
    @Override
    public Object call() throws Exception {
        return Thread.currentThread().getName();
    }
}
