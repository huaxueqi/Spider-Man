package guava;

import com.google.common.util.concurrent.*;
import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("star");
        ExecutorService delegate = Executors.newFixedThreadPool(5);
        try {
            ListeningExecutorService executorService = MoreExecutors.listeningDecorator(delegate);
            List<ListenableFuture<Integer>> futureList = new ArrayList<>();
            for (int i = 5; i >= 0; i--) {
                int j = i;
                futureList.add(executorService.submit(() -> {
                    TimeUnit.SECONDS.sleep(j);
                    return j;
                }));

            }
            ListenableFuture<List<Integer>> listListenableFuture = Futures.allAsList(futureList);
            Futures.addCallback(listListenableFuture, new FutureCallback<List<Integer>>() { //回调
                @Override
                public void onSuccess(@Nullable List<Integer> result) {
                    System.out.println("result中所有结果之和：" + result.stream().reduce(Integer::sum).get());
                }

                @Override
                public void onFailure(Throwable t) {
                    System.out.println("执行任务发生异常:" + t.getMessage()+"  "+ t);
                }
            }, MoreExecutors.directExecutor());
        } finally {
            delegate.shutdown();
        }
    }
}
