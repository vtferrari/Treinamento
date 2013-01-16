package server;

import java.io.Serializable;
import java.util.ArrayList;
import model.Lote;
import model.Produto;

public class LotesEmLeilao implements Serializable {

    private static ArrayList<Lote> listaDeLotes = new ArrayList();

    public static ArrayList<Lote> getLotesEmLeilao() {
        return listaDeLotes;
    }

    public static boolean removerLote(Lote l) {
        return listaDeLotes.remove(l);
    }

    public static boolean adicionarLote(Lote lote) {
        if (listaDeLotes.contains(lote)) {
            return true;
        }
        lote.setAtivo(true);
        for (Produto p : lote.getProdutos()) {
            p.setAtivo(true);
        }
        return listaDeLotes.add(lote);
    }
}