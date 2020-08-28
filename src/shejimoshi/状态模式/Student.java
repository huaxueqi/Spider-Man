package shejimoshi.状态模式;

public class Student {
    private State state;

    public Student(State state) {
        this.state = state;
    }

    /**
     * 设置状态
     */
    public void setState(State state) {
        this.state = state;
    }

    public double operate(double num1, double num2) {
        return state.operate(num1, num2);
    }

}
