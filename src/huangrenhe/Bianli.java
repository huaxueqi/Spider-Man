package huangrenhe;

import com.sun.javafx.collections.MappingChange;
import com.sun.xml.internal.xsom.impl.scd.Iterators;
import shejimoshi.迭代器模式.Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bianli {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);

        Iterator iterator = (Iterator) arrayList.iterator();
        while (iterator.hasNext()){
            int a = (int) iterator.next();
            System.out.println(a);
        }

        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = map.keySet();
        for (Integer integer :map.keySet()){
            Integer str=map.get(integer);
        }
    }
}
