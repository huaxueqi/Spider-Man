package shejimoshi.享元模式;

public class Test {
    public static void main(String[] args) {
        /**
         * 创建享元工厂
         */
        FlyweightFactory factory = new FlyweightFactory();
        /***第一种情况：key相同时 *********/
        FlyWeight flyWeightA = factory.getFlyWeight("aaa");
        FlyWeight flyWeightB = factory.getFlyWeight("aaa");
        /**
         * 透过打印结果为true可以知道： 由于key都为"aaa"，所以flyWeightA和flyWeightB指向同一块内存地址
         */
        System.out.println(flyWeightA == flyWeightB);
        flyWeightA.method();
        flyWeightB.method();
        /**
         * 享元对象数量：1
         */
        System.out.println(factory.getCount());

        /***第二种情况：key不相同时 *********/
        System.out.println("\n======================================");
        FlyWeight flyWeightC = factory.getFlyWeight("ccc");
        /**
         * 打印结果为false
         */
        System.out.println(flyWeightA == flyWeightC);
        flyWeightA.method();
        flyWeightC.method();
        /**
         * 享元对象数量：2
         */
        System.out.println(factory.getCount());
    }
}