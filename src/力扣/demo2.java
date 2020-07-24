package 力扣;

import java.util.concurrent.CountDownLatch;

public class demo2 {
    public static void main(String[] args) {
        CountDownLatch c1=null;
        CountDownLatch c2=null;
        c1=new CountDownLatch(1);
        c2=new CountDownLatch(1);
        c1.countDown();
        int i=(int)Math.sqrt(8);
    }
}
