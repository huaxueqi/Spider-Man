package 限流算法;

import com.google.common.util.concurrent.RateLimiter;

import java.util.concurrent.TimeUnit;

public class LouTong {
    //令牌桶  限流工具类RateLimiter
    public static void main(String[] args) throws  InterruptedException {
        RateLimiter limiter=RateLimiter.create(5,100, TimeUnit.SECONDS);//预热期
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
