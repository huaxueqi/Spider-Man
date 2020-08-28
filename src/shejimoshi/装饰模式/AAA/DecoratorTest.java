package shejimoshi.装饰模式.AAA;

public class DecoratorTest {
    public static void main(String[] args) {
        //拿着自己的原始成绩单。
        SchoolScore mScore = new ConcreteStudent();
        //加上一层修饰，最高分的修饰。
        mScore = new HighScoreDecorator(mScore);
        //再加上第二次修饰，我的排名的修饰。
        mScore = new SortDecorator(mScore);
        //做出报告说明
        mScore.report();
        //可以让家长签字了
        mScore.sign("lzl");
    }
}
