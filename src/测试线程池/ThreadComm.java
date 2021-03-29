package 测试线程池;

public class ThreadComm extends  Thread {
    //volatile修饰，保证线程可见性，这里不需要保证原子性，因为run有if判断
    private volatile static int state = 0;
    private static final String name = "ABC";
    private final int type;
    ThreadComm(int type){
        this.type = type;
    }
    @Override
    public void run() {
        for (int i = 0; i <10 ; ) {
            if (state % 3 == type) {
                System.out.print(name.charAt(type)+"   ");
                state++;
                i++;
            }
        }
    }
    public static void main(String[] args) {
        new ThreadComm(0).start();
        new ThreadComm(1).start();
        new ThreadComm(2).start();
    }
}
