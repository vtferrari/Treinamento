package sorte;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sorte1 {

    public static void main(String[] args) {
        for (int i = 0; i <= 10000000; i++) {
            Globo.sortear();
        }
        int t = Globo.numeros.size() - 1;
        Globo t1 = new Globo(0, t);

        ExecutorService executa = Executors.newFixedThreadPool(4);
        executa.execute(t1);
        executa.shutdown();



    }
}
