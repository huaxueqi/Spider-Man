package 限流算法;

import com.google.common.util.concurrent.RateLimiter;

public class tong {
    public static void main(String[] args) {
        RateLimiter  limiter=RateLimiter.create(5);
        for(int i=0;i<10;i++){
            limiter.acquire();
            System.out.println(System.currentTimeMillis());
        }
        System.out.println("_____________________________");
        limiter.setRate(10);
        for(int i=0;i<10;i++){
            limiter.acquire();
            System.out.println(System.currentTimeMillis());
        }
    }
}
