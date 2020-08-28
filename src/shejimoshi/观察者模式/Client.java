package shejimoshi.观察者模式;

public class Client
{
    public static void main(String[] args)
    {

        ConcreteSubject concreteSubject= new ConcreteSubject();

        concreteSubject.setSubjectState("老板来了");
        concreteSubject.Attach(new ConcreteObserver1(concreteSubject,"李四"));
        concreteSubject.Attach(new ConcreteObserver2(concreteSubject,"张三"));
        concreteSubject.Notify();

    }


}