package shejimoshi.观察者模式;

import java.util.ArrayList;

class ConcreteSubject extends Subject
{
    private ArrayList<Observer> list = new ArrayList<Observer>();

    public void Attach(Observer observer)
    {
        list.add(observer);
    }

    public void Detach(Observer observer)
    {
        list.remove(observer);
    }

    public void Notify()
    {
        for (Observer o : list)
        {
            o.update();
        }
    }
}
