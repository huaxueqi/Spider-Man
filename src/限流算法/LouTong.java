package 限流算法;

import com.google.common.util.concurrent.RateLimiter;

import java.util.concurrent.TimeUnit;

public class LouTong {
    public static void main(String[] args) throws  InterruptedException {
        RateLimiter limiter=RateLimiter.create(5,100, TimeUnit.SECONDS);
        for(int i=0;i<10;i++){
            limiter.acquire();
            System.out.println(System.currentTimeMillis());
        }
        Thread.sleep(1000);
        System.out.println("_____________________________");
        for(int i=0;i<10;i++) {
            limiter.acquire();
            System.out.println(System.currentTimeMillis());
        }
    }
}
