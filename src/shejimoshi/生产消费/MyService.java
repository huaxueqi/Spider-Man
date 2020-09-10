package shejimoshi.生产消费;

import java.util.ArrayList;

public class MyService {
    public ArrayList<Integer> list = new ArrayList<Integer>();//用list存放生产之后的数据，最大容量为1

    synchronized public void produce() {

        try {
            /*只有list为空时才会去进行生产操作*/
            while (!list.isEmpty()) {
                System.out.println("生产者" + Thread.currentThread().getName() + " waiting");
                this.wait();
            }
            int value = 9999;
            list.add(value);
            System.out.println("生产者" + Thread.currentThread().getName() + " Runnable");
            this.notifyAll();//然后去唤醒因object调用wait方法处于阻塞状态的线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void consmer() {
        try {
            /*只有list不为空时才会去进行消费操作*/
            while (list.isEmpty()) {
                System.out.println("消费者" + Thread.currentThread().getName() + " waiting");
                this.wait();
            }
            list.clear();
            System.out.println("消费者" + Thread.currentThread().getName() + " Runnable");
            this.notifyAll();//然后去唤醒因object调用wait方法处于阻塞状态的线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
