package shejimoshi.装饰模式.qqq;

public class Test {
    public static void main (String args[])
    {
        Concrete concrete = new Concrete();
        DecoratorA a = new DecoratorA();
        DecoratorB b = new DecoratorB();
        DecoratorC c = new DecoratorC();

        a.setSuper(concrete);
        //体现装饰模式优势的地方来了
        b.setSuper(a);
        c.setSuper(b);

        //a.Operation();
        //b.Operation();
        c.Operation();
        //concrete.Operation();
    }
}
