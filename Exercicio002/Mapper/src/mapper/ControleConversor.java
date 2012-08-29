package mapper;

import java.util.List;

class ControleConversor {

    public String intParaString(int inteiro) {
        return new IntParaString().map(inteiro);
    }

    public int stringParaInt(String string) {
        return new StringParaInt().map(string);
    }

    public char intParaChar(int vChar) {
        return new IntParaChar().map(vChar);
    }

    public int charParaInt(char c) {
        return new CharParaInt().map(c);
    }

    public Lebre gatoParaLebre(Gato c) {
        return new GatoParaLebre().map(c);
    }

    List mapear(List l, Mapper m) {
        return new Mapear().mapear(l, m);
    }
}
