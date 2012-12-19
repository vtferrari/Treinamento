package contadormaluco;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ContadorMaluco {

    public static Runnable contador() {
        return new Runnable() {
            @Override
            public void run() {
                for (long i = 0; i < 100000; i++) {
                    try {
                        Acumula.acumulador();
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ContadorMaluco.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                System.out.println("Total de passadas = " + Acumula.getTotal());
            }
        };
    }

    public static void main(String[] args) {
        Thread c1 = new Thread(contador());
        Thread c2 = new Thread(contador());
        c1.start();
        c2.start();

        

    }
}
