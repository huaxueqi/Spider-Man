package shejimoshi.Factory;

public class subFactory extends  operateFactory{

    @Override
    public double getResult() {
        return getX()-getY();
    }
}
