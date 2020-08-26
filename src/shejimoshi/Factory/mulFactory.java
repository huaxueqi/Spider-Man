package shejimoshi.Factory;

public class mulFactory extends  operateFactory {
    @Override
    public double getResult() {
        return getX()*getY();
    }
}
