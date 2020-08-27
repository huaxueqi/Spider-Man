package shejimoshi.建造者模式;

public class Client {
    public static void main(String[] args) {
        InstranceContract.ConcreteBuilder builder =
                new InstranceContract.ConcreteBuilder("8888", 1233L, 2253L);

        // 导演者进行组装
        InstranceContract contract =
                builder.setOtherData("测试数据").setCompanyName("啦啦啦").build();

        contract.someOperation();
    }
}