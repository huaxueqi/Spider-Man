package shejimoshi.装饰模式.qqq;

public class Decorator implements SuperC
{
    SuperC super1;

    public void setSuper (SuperC super1)
    {
        this.super1 = super1;
    }

    @Override
    public void Operation()
    {
        if (super1 != null)
        {
            super1.Operation();
        }
    }
}
