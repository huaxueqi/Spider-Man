package 测试线程池;

import java.util.concurrent.*;

public class testThreadPool {
    public static void main(String[] args) {
        ExecutorService th= Executors.newFixedThreadPool(4);
        CompletionService<Integer> completionService =new ExecutorCompletionService<Integer>(th);
        for(int i=0;i<4;i++){
            int sleep =i;
            completionService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    if(sleep==2){
                        Thread.sleep(5000);
                    }else{
                        Thread.sleep(1000);
                    }
                    return sleep;
                }
            });
        }
        th.shutdown();
        for(int j=0;j<4;j++){
            try {
                System.out.println("线程:"+completionService.take().get()+" 任务执行结束:");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

    }
}
