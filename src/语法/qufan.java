package 语法;

import java.util.HashMap;
import java.util.Map;

public class qufan {
    public static void main(String[] args) {
        /*int a=-10;
        long b=10;
        System.out.println(Math.negateExact(a));
        System.out.println(Math.negateExact(b));*/
       Map m=new HashMap();
        m.put("1",1);
        m.put("2",2);
        m.put("3",3);
        m.put("4",4);
        m.put("5",5);
        m.put("6",6);
        m.put("7",7);
        m.put("8",8);
        m.forEach((n1,n2) -> {
            System.out.println(n1+"    "+n2);
        });
    }
}
