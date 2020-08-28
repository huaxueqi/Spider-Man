package shejimoshi.抽象工厂模式;

public class EmailSendFactory implements AbstractFactory {

    @Override
    public Sender produce() {
        return new EmailSender();
    }
}