package shejimoshi.抽象工厂模式;

public class EmailSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is a 邮件...");
    }
}

