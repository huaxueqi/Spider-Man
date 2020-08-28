package shejimoshi.装饰模式.AAA;

public class ConcreteStudent extends SchoolScore{
    @Override
    public void report() {
        System.out.println("我的语文成绩是 89，数学成绩是 78，英语成绩是 77.");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签字:"+name);
    }
}