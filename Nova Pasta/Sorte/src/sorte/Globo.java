package sorte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Globo implements Runnable {

    private static final List numeros = Collections.synchronizedList(new ArrayList<>());

    public static void sortear() {
        Random r = new Random();
        numeros.add(r.nextLong());
    }

    public synchronized void organizar() {
        Collections.sort(numeros);
    }

    @Override
    public void run() {
        synchronized (numeros) {
            organizar();
        }
    }
}
