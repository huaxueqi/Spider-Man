package shejimoshi.中介者模式;

public class LiSi extends User {

    public LiSi(Mediator mediator) {
        super(mediator);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void selectHouse() {
        System.out.println("李四在选房子...");
    }
}