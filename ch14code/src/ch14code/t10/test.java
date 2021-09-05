package ch14code.t10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1","asd");
        map.put("2","zxc");
        map.put("3","qwe");

        Set keyset = map.keySet();
        Iterator it = keyset.iterator();
        while (it.hasNext()){
            Object key = it.next();
            Object value = map.get(key);
            System.out.println(key + " : " + value);
        }

        Set keyset1 = map.entrySet();
        Iterator it1 = keyset1.iterator();
        while (it1.hasNext()){
            Object key = it1.next();
            System.out.println(key);
        }
    }
}
