package contadormaluco;

import java.util.concurrent.atomic.AtomicLong;

public class Acumula implements Runnable {

    private volatile static AtomicLong acumulador = new AtomicLong(0);

    public static void acumulador() {
        acumulador.addAndGet(1);
    }

    public static long getTotal() {
        return acumulador.get();
    }

    @Override
    public void run() {
        long i = 0;
        for (; i < 10000000; i++) {
            Acumula.acumulador();
            Thread.currentThread().yield();
        }
        System.out.println("Total de passadas = " + Acumula.getTotal());
        System.out.println("Total do For = " + i);
    }
}
