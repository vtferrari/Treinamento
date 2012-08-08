package mapper;

import java.util.ArrayList;
import java.util.List;

class ControleConversor {

    public String intParaString(int inteiro) {
        Mapper<Integer, String> m = new IntParaString();
        return m.map(inteiro);
    }

    public int stringParaInt(String string) {
        Mapper<String, Integer> m = new StringParaInt();
        return m.map(string);
    }

    public char intParaChar(int vChar) {
        Mapper<Integer, Character> m = new IntParaChar();
        return m.map(vChar);
    }

    public int charParaInt(char c) {
        Mapper<Character,Integer> m = new CharParaInt();
        return m.map(c);
    }

    public Lebre gatoParaLebre(Gato c) {
        Mapper<Gato,Lebre> m = new GatoParaLebre();
        return m.map(c);
    }
    
    List mapear(List l, Mapper m) {
        Mapear mapear = new Mapear();
        return mapear.mapear(l, m);
    }

}
