package guava;

import com.google.common.util.concurrent.*;
import com.sun.istack.internal.Nullable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService delegate = Executors.newFixedThreadPool(5);
        try {
            ListeningExecutorService executorService = MoreExecutors.listeningDecorator(delegate);
            ListenableFuture<Integer> submit = executorService.submit(() -> {
                System.out.println(System.currentTimeMillis());
                TimeUnit.SECONDS.sleep(4);
                System.out.println(System.currentTimeMillis());
                return 10;
            });
            Futures.addCallback(submit, new FutureCallback<Integer>() {
                @Override
                public void onSuccess(@Nullable Integer result) {
                    System.out.println("执行成功:"+result);
                }

                @Override
                public void onFailure(Throwable t) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("执行任务发生异常:" + t.getMessage());
                }
            }, MoreExecutors.directExecutor());
            System.out.println(submit.get());
        } finally {
            delegate.shutdown();
        }
    }
}
