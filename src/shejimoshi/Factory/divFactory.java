package shejimoshi.Factory;

public class divFactory extends  operateFactory{

    @Override
    public double getResult() {
        return getX()/getY();
    }
}
