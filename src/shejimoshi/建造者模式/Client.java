package shejimoshi.建造者模式;

public class Client {
    public static void main(String[] args) {
        /**
         * 建造者模式将很多功能集成到一个类里，这个类可以创造出比较复杂的东西。
         * 所以与工厂模式的区别就是：工厂模式关注的是创建单个产品，而建造者模式则关注创建复合对象，多个部分
         */
        InstranceContract.ConcreteBuilder builder =
                new InstranceContract.ConcreteBuilder("8888", 1233L, 2253L);

        // 导演者进行组装
        InstranceContract contract =
                builder.setOtherData("测试数据").setCompanyName("啦啦啦").build();

        contract.someOperation();
    }
}