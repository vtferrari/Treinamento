package explode;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Explode {

    public static void main(String[] args) {
        
        ExecutorService executa = Executors.newFixedThreadPool(4);
        executa.execute(new Pavil());
        executa.execute(new CortaPavil());
        executa.shutdown();
        
    }
}
