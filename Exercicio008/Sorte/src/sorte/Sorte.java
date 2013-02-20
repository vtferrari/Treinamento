package sorte;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sorte {

    public static void main(String[] args) {
        for (int i = 0; i <= 10000000; i++) {
            Globo.sortear();
        }
        int t = Globo.size() - 1;
        Globo t1 = new Globo(0, t / 4);
        Globo t2 = new Globo((t / 4) + 1, t / 2);
        Globo t3 = new Globo((t / 2) + 1, 3 * t / 4);
        Globo t4 = new Globo(3 * t / 4, t);

        System.out.println("lol");
        ExecutorService executa = Executors.newFixedThreadPool(4);
        executa.execute(t1);
        executa.execute(t2);
        executa.execute(t3);
        executa.execute(t4);
        executa.shutdown();
        
        
    }
}
