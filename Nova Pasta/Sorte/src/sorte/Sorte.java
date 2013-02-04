
package sorte;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sorte {
    
    public static void main(String[] args) {
        for(int i = 0 ;i<=5000000;i++){
            Globo.sortear();
        }
        
        ExecutorService executa = Executors.newFixedThreadPool(4);
        executa.execute(new Globo());
        executa.shutdown();
        
        
        
    }
}
