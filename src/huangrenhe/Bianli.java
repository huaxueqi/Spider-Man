package huangrenhe;

import java.util.*;

public class Bianli {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);

        Iterator iterator = arrayList.iterator();
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
