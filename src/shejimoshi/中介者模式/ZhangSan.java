package shejimoshi.中介者模式;

public class ZhangSan extends User {

    public ZhangSan(Mediator mediator) {
        super(mediator);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void selectHouse() {
        System.out.println("张三在选房子...");
    }
}
