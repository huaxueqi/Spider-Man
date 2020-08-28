package shejimoshi.抽象工厂模式;

public class Test {
    public static void main(String[] args) {
        /**
         * 创建工厂
         */
        AbstractFactory factory = new EmailSendFactory();
        /**
         * 生产产品
         */
        Sender sender = factory.produce();
        /**
         * 执行业务逻辑
         */
        sender.send();

    }

}