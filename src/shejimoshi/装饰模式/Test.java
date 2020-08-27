package shejimoshi.装饰模式;

public class Test {
    public static void main(String[] args) {
        /**
         * 目标对象
         */
        Filterable targetObj = new Filter();
        /**
         * 包装对象(对目标对象进行包装)
         */
        Filterable decorObj = new DecoratorForFilter1(new DecoratorForFilter2(
                targetObj));
        /**
         * 执行包装后的业务方法
         */
        decorObj.filter();
    }
}