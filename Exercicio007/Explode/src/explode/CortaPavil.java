package explode;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class CortaPavil extends Bomba implements Runnable {

    @Override
    public void run() {

        read.lock();
        try {
            for (AtomicInteger f : cartucho) {
                System.out.println(f.get());
            }
        } finally {
            read.unlock();
        }
    }
}
