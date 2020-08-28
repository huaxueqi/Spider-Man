package shejimoshi.装饰模式.qqq;

public class DecoratorB extends Decorator
{
    @Override
    public void Operation()
    {
        super.Operation();
        // 自己的操作
        System.out.println("执行方法+DecoratorB");
    }

    public void SpecialB()
    {

    }
}