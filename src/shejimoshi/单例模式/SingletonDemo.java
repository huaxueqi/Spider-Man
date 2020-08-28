package shejimoshi.单例模式;

public class SingletonDemo {
    private static class SingletonHolder{
        private static SingletonDemo instance=new SingletonDemo();
    }
    private SingletonDemo(){
    }
    public static SingletonDemo getInstance(){
        return SingletonHolder.instance;
    }

    public static void main(String[] args) {
        System.out.println(SingletonDemo.getInstance());
    }
}