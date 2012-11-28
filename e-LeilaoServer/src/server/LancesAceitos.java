package server;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import model.Lance;
import model.Produto;
import model.Usuario;

public class LancesAceitos implements Serializable {

    private static ArrayList<Lance> listaDeLances = new ArrayList<Lance>();

    public static ArrayList obterLances() {
        return listaDeLances;
    }

    public static Lance obterLance(Produto p) {
        for (Lance l : listaDeLances) {
            if (l.getProduto().equals(p)) {
                return l;
            }
        }
        return null;
    }

    public static boolean verificarLance(Lance novolance) {
        if (novolance.getProduto().getValorMinimo() >= novolance.getValor()) {
            return false;
        }
        if (!listaDeLances.contains(novolance)) {
            novolance.getProduto().setValorMinimo(novolance.getValor());
            novolance.setData(new Timestamp(new Date().getTime()));
            listaDeLances.add(novolance);
            return true;
        }
        Lance lanceAntigo = listaDeLances.get(listaDeLances.indexOf(novolance));
        if (lanceAntigo.getValor() >= novolance.getValor()) {
            return false;
        }
        lanceAntigo.getProduto().setValorMinimo(novolance.getValor());
        lanceAntigo.setValor(novolance.getValor());
        lanceAntigo.setUsuario(novolance.getUsuario());
        lanceAntigo.setData(new Timestamp(new Date().getTime()));
        return true;
    }

}
