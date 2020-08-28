package shejimoshi.状态模式;

public class SubOperator implements State {
    @Override
    public double operate(double num1, double num2) {
        return num1 - num2;
    }
}
