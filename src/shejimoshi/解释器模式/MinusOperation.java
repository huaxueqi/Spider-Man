package shejimoshi.解释器模式;

public class MinusOperation implements Operatable {

    @Override
    public double interpreter(Entity entity) {
        return entity.getNum1() - entity.getNum2();
    }
}
