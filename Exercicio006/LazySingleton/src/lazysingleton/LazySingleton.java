package lazysingleton;

import beam.Filme;

public class LazySingleton {

    private static Filme instancia;

    public static synchronized Filme getInstancia() {
        if (instancia == null) {
            instancia = new Filme();
        }
        return instancia;
    }
}
