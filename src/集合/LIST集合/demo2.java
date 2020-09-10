package 集合.LIST集合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class demo2 {
    public static void main(String[] args) {
     List l= new ArrayList();
     l.add("111");
     l.add("222");
     l.add("222");
     demo2.frequencyOfListElements(l).forEach((k,v)->{
         System.out.println(k+"  "+v);
     });
    }
    public static Map<String,Integer> frequencyOfListElements( List<String> items ) {
        if (items == null || items.size() == 0) return null;
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String temp : items) {
            Integer count = map.get(temp);
            map.put(temp, (count == null) ? 1 : count + 1);
        }
        return map;
    }

}
