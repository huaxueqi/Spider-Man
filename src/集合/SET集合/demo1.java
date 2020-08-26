package 集合.SET集合;

import java.util.*;

public class demo1 {
    public static void main(String[] args) {
        List<Set<String>> setList=new ArrayList<>();
        Set set=new HashSet();
        set.add("1");
        set.add("1");
        set.add("2");
        set.add("5");
        set.add("7");
        set.add("8");
        setList.add(set);
        setList.forEach(l->{
            System.out.println(l);
        });
        set.forEach(s->{
            System.out.println(s+"  ");
        });

        String str=(String)null;
        int a=(int)'b';
        System.out.println(a);
    }
}
