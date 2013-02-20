package sorte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Globo implements Runnable {

    public static final List<Integer> numeros = new ArrayList<>();
    public volatile List<Integer> aux;

    public Globo(int de, int ate) {
        organizarParte(de, ate);
    }

    private void organizarParte(int de, int ate) {
        aux = numeros.subList(de, ate);
    }

    public static void sortear() {
        Random r = new Random();
        numeros.add(r.nextInt());
    }

    public void organizar() {
        Collections.sort(aux);
    }

    @Override
    public void run() {
        organizar();
    }
}
