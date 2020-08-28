package shejimoshi.抽象工厂模式;

public class SmsSendFactory implements AbstractFactory {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}