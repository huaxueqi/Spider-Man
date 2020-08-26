package 集合.SET集合.MAP集合;

import java.util.TreeMap;

public class TreeMaptest {
    public static void main(String[] args) {
        TreeMap t=new TreeMap();
        t.put(1,"ag");
        t.put(5,"ag");
        t.put(9,"ag");
        t.put(2,"ag");
        t.put(4,"ag");
        t.put(3,"ag");
        t.put(5,"ag");
        t.put(7,"ag");
        t.forEach((m,n)->{
            //System.out.println(m+"   "+n);
        });
        String s1="asdga";
        char [] a=s1.toCharArray();
        /*String s=new String(a,true);
        System.out.println( t.firstEntry());
        System.out.println(t.firstKey());
        System.out.println(t.lastKey());*/
        //File
        scan:{
              for(int i=0;i<10;i++){
                  System.out.println(i);
                  if(i==3)
                      break scan;
              }
              System.out.println("END里");
        }
        System.out.println("END外");
    }
}
