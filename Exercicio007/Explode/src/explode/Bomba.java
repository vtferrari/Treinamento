package explode;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class Bomba implements Runnable {

    protected static volatile List<AtomicInteger> cartucho = new ArrayList();
    protected static volatile AtomicInteger contador = new AtomicInteger(0);
    protected static final ReentrantReadWriteLock rwlock = new ReentrantReadWriteLock();
    protected static final Lock write = rwlock.writeLock();
    protected static final Lock read = rwlock.readLock();

    public static void maisPolvora() {
        cartucho.add(new AtomicInteger(contador.incrementAndGet()));
    }

}
