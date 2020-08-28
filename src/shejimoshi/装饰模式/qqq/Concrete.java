package shejimoshi.装饰模式.qqq;

public class Concrete implements SuperC
{
    @Override
    public void Operation() {
        //被修饰的类的基本操作
        System.out.println("执行方法+Concrete");
    }

}
