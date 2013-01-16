package explode;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CortaPavil extends Bomba implements Runnable {

    @Override
    public void run() {

        read.lock();
        try {
            for (AtomicInteger f : cartucho) {
                System.out.println(f.get());
                Thread.currentThread().yield();
            }
        } finally {
            read.unlock();
        }
    }
}
