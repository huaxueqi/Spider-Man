package 测试线程池;

import java.util.concurrent.atomic.AtomicInteger;

public class printABC {
    public static void main(String[] args) {
        AtomicInteger index = new AtomicInteger(0);
        new Thread(() -> {
            while (index.get() <= 10) {
                if (index.get() % 3 == 0) {
                    System.out.print("A");
                    index.incrementAndGet();
                }
            }
        }).start();
        new Thread(() -> {
            while (index.get() <= 10) {
                if (index.get() % 3 == 1) {
                    System.out.print("B");
                    index.incrementAndGet();
                }
            }
        }).start();
        new Thread(() -> {
            while (index.get() <= 10) {
                if (index.get() % 3 == 2) {
                    System.out.print("C");
                    index.incrementAndGet();
                }
            }
        }).start();
    }
}
