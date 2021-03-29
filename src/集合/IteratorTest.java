package 集合;

import java.util.Iterator;
import java.util.Vector;

public class IteratorTest {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("goudan");
        list.add("mafei");
        list.add("lubenwei");
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                Iterator<String> iterator = list.iterator();
                while(iterator.hasNext()){
                    String str = iterator.next();
                    System.out.println(str);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                Iterator<String> iterator = list.iterator();
                while(iterator.hasNext()){
                    String str = iterator.next();
                    if (str.equals("lisi")) {
                        iterator.remove();
                    }
                }
            }
        };
        thread1.start();
        thread2.start();
    }
}