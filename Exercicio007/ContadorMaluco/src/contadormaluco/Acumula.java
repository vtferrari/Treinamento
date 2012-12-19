package contadormaluco;

public class Acumula {
    
    private static long acumulador;
    
    public static void acumulador() {
        acumulador++;
    }
    
    public static long getTotal() {
        return acumulador;
    }



}
