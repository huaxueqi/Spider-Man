package shejimoshi.生产消费1;

public class ConsumeThread extends Thread {
    private Consumer c;
    public ConsumeThread(Consumer c){
        this.c = c;
    }
    @Override
    public void run() {
        while (true) {
            c.consmer();
        }
    }
}
