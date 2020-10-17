package huangrenhe;

public class DoubleCheck {
    private static DoubleCheck instance;
    private DoubleCheck(){}
    public static DoubleCheck getInstance(){
        if (instance==null){
            synchronized (DoubleCheck.class){//双重校验线程安全
                if (instance==null){
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(DoubleCheck.getInstance());
    }
    /*意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点。

主要解决：一个全局使用的类频繁地创建与销毁。

何时使用：当您想控制实例数目，节省系统资源的时候。

如何解决：判断系统是否已经有这个单例，如果有则返回，如果没有则创建。

关键代码：构造函数是私有的。

优点： 1、在内存里只有一个实例，减少了内存的开销，尤其是频繁的创建和销毁实例（比如管理学院首页页面缓存）。 2、避免对资源的多重占用（比如写文件操作）。

缺点：没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么样来实例化。*/
}


