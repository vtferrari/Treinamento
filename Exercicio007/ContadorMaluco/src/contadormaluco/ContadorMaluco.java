package contadormaluco;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ContadorMaluco {

    public static void main(String[] args) {
        ExecutorService executa = Executors.newFixedThreadPool(4);
        executa.execute(new Acumula());
        executa.execute(new Acumula());
        executa.shutdown();
    }
}