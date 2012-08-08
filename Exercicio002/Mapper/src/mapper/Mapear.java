package mapper;

import java.util.ArrayList;
import java.util.List;

public class Mapear {


    List mapear(List l, Mapper m) {
        List mapeadList = new ArrayList();

        for (int i = 0; i < l.size(); i++) {
            mapeadList.add(m.map(l.get(i)));
        }

        return mapeadList;
    }
}
