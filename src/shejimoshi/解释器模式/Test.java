package shejimoshi.解释器模式;

public class Test {
    public static void main(String[] args) {
        /**
         * 创建加法、减法运算
         */
        AddOperation addOperation = new AddOperation();
        MinusOperation minusOperation = new MinusOperation();
        /**
         * 一、分步运算
         */
        double addResult = addOperation.interpreter(new Entity(20, 30));
        double minusResult = minusOperation.interpreter(new Entity(20, 30));
        System.out.println("addResult = " + addResult);
        System.out.println("minusResult = " + minusResult);
        /**
         * 二、混合运算
         */
        double mixResult = new AddOperation().interpreter(new Entity(
                addOperation.interpreter(new Entity(20, 30)), minusOperation
                .interpreter(new Entity(40, 50))));
        System.out.println("mixResult = " + mixResult);
    }
}