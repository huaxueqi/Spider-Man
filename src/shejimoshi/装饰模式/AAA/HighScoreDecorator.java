package shejimoshi.装饰模式.AAA;

public class HighScoreDecorator extends MyDecorator{
    public HighScoreDecorator(SchoolScore score) {
        super(score);
    }
    private void highScoreSchool() {
        System.out.println("语文最高分：99,数学最高分：88，英语最高分：77");
    }
    @Override
    public void report() {
        //先说明最高成绩
        this.highScoreSchool();
        //再报自己的成绩
        super.report();
    }
}