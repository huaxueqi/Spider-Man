package 测试原子数组;

import java.util.concurrent.atomic.LongAdder;

public class testLongAdder {
     static    LongAdder longAdder = new LongAdder();
     static    int a =10;
    public static void main(String[] args) {
          longAdder.add(10);
          longAdder.increment();
          System.out.println(longAdder.intValue());
          System.out.println("_____________________");
     /*     Date d=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();*/
          System.out.println(a++);


    }
}
