package 力扣;

import java.util.concurrent.Semaphore;

class 哲学家进餐 {
    //一个互斥信号量用于临界资源的互斥访问
    private Semaphore mutex;
    //5个同步信号量用于哲学家之间的同步访问
    private Semaphore[] sema;
    public 哲学家进餐() {
        mutex = new Semaphore(1);
        sema = new Semaphore[] {
                new Semaphore(1),
                new Semaphore(1),
                new Semaphore(1),
                new Semaphore(1),
                new Semaphore(1)
        };
    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
        //一个哲学家如果要拿起叉子就同时拿两个，因此这里是一个原子操作，需要用mutex信号量包起来，表示互斥
        mutex.acquire();
        //尝试获取左手边的叉子
        sema[philosopher].acquire();
        //尝试获取右手边的叉子
        sema[(philosopher+1) % 5].acquire();

        pickLeftFork.run();
        pickRightFork.run();
        //我认为这句话应该放在这里。
        // mutex.release();

        //拿到叉子开始吃饭
        eat.run();

        //吃完饭放下叉子
        putLeftFork.run();
        sema[philosopher].release();
        putRightFork.run();
        sema[(philosopher+1) % 5].release();
        mutex.release();
    }
}

