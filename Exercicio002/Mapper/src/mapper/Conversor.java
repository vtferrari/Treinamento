package mapper;

import java.util.ArrayList;
import java.util.List;

class Conversor {

    public String intParaString(int inteiro) {
        Mapper<Integer,String> m = new IntParaString();
        return m.map(inteiro);
    }

    public int stringParaInt(String string) {
        Mapper<String,Integer> m = new StringParaInt();
        return m.map(string);
    }

    List<String> mapear(List l, Mapper<Integer,String> m) {
        List<String> listaString = new ArrayList<>();

        for (int i = 0; i < l.size(); i++) {
            listaString.add(intParaString((int) l.get(i)));
        }
        return listaString;
    }
}
