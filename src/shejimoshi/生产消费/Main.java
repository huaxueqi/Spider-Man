package shejimoshi.生产消费;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Object object = new Object();
        ArrayList<Integer> list = new ArrayList<Integer>();
        MyService ms=new MyService();
        ProduceThread[] pt = new ProduceThread[2];
        ConsumeThread[] ct = new ConsumeThread[2];
        for(int i=0;i<2;i++){
            pt[i] = new ProduceThread(ms);
            pt[i].setName("生产者 "+(i+1));
            ct[i] = new ConsumeThread(ms);
            ct[i].setName("消费者"+(i+1));
            pt[i].start();
            ct[i].start();
        }
    }
}
