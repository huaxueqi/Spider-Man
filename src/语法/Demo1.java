package 语法;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
       /* Map m=new HashMap<>();
        m.put("id",342);
        Integer b=342;
        System.out.println(m.get("id")==b);
        Integer c=23179574;
        Integer d=23179574;
        System.out.println(c==d);
        String s;*/
        List list=new ArrayList<>();
        List<Integer> newlist=new ArrayList<>();

        list.add("[5");
        list.add("6");
        list.add("7");
        list.add("8]");
    list.forEach(l->{
    //System.out.println(l);
});
    String s="";


 for(Object t:list){
 s+=t;
 }
 //System.out.println(s);
        char a[]=s.toCharArray();
        for(char q:a){
            if(!(q =='[' || q ==']')){
                newlist.add(q-'0');
            }
        }
        newlist.forEach(l->{
            System.out.println(l);
        });
    }
}
