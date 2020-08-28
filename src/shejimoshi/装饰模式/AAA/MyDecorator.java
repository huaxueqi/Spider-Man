package shejimoshi.装饰模式.AAA;

public abstract class MyDecorator extends SchoolScore{
    //定义学生的成绩
    private SchoolScore score;
    //用构造函数，实例化学生成绩类。
    public MyDecorator(SchoolScore score) {
        this.score = score;
    }
    //抽象方法，为学生提交成绩单时，添加一些修饰方法。
    public void report(){
        this.score.report();
    }

    //重写父类的方法。让家长签字
    @Override
    public void sign(String name) {
        this.score.sign(name);
    }
}