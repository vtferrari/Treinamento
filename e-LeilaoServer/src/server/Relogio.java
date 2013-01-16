package server;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Lote;

public class Relogio implements Runnable {

    public String horaAtual;
    private Date momento = new Date();
    private Lote lote;

    public void iniciarContagem(Lote lote) throws InterruptedException, ParseException {
        this.lote = lote;
    }

    public String contdown(Lote lote) {
        long dt = lote.getLimiteTempo().getTime() - momento.getTime();
        long s = (dt) / 1000;
        long m = s / 60;
        long h = m / 60;
        s = s - (m * 60);
        m = m - (h * 60);
        return (h + ":" + m + ":" + s);
    }

    @Override
    public void run() {
        while (momento.compareTo(lote.getLimiteTempo()) <= 0) {
            try {
                momento = new Date();
                System.out.println(lote.getId());
                System.out.println("Relogio: " + new SimpleDateFormat("HH:mm:ss").format(momento));
                System.out.println("Lote Ativo: " + lote.isAtivo());
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
        lote.setAtivo(false);
        System.out.println("Lote Ativo: " + lote.isAtivo());
    }
}
