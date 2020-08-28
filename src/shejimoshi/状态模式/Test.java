package shejimoshi.状态模式;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(new AddOperator());
        System.out.println(s1.operate(12, 23));
        /**
         * 改变状态，即改变了行为 --> 加法运算变成了减法运算
         */
        s1.setState(new SubOperator());
        System.out.println(s1.operate(12, 23));
    }
}