package shejimoshi.Factory;

public class addFactory  extends  operateFactory{

    @Override
    public double getResult() {
        return getX()+getY();
    }
}
