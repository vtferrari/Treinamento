package explode;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pavil extends Bomba implements Runnable {

    @Override
    public void run() {
        write.lock();
        try {
            for (int j = 1; j <= 1000; j++) {
                Bomba.maisPolvora();
            }
        } finally {
            write.unlock();
        }

    }
}
