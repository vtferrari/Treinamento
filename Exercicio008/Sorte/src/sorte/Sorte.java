package sorte;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sorte {

    public static void main(String[] args) {
        for (int i = 0; i <= 10000000; i++) {
            Globo.sortear();
        }
        Globo t1 = new Globo();
        Globo t2 = new Globo();
        Globo t3 = new Globo();
        Globo t4 = new Globo();
        int t = Globo.numeros.size() - 1;

        t1.organixarParte(0, t / 4);
        t2.organixarParte((t / 4) + 1, t / 2);
        t3.organixarParte((t / 2) + 1, 3 * t / 4);
        t4.organixarParte(3 * t / 4, t);

        ExecutorService executa = Executors.newFixedThreadPool(4);
        executa.execute(t1);
        executa.execute(t2);
        executa.execute(t3);
        executa.execute(t4);
        executa.shutdown();


    }
}
