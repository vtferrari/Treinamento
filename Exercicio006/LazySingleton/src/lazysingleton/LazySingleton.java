package lazysingleton;

import beam.Filme;

public class LazySingleton {
    
    private static volatile Filme instancia;
    private static final Object o = new Object();

    public static Filme getInstancia() {
        if (instancia == null) {
            synchronized(o) {
                if (instancia == null) {
                    instancia = new Filme();
                }
            }
        }
        return instancia;
    }
}
