package shejimoshi.装饰模式.AAA;

public class SortDecorator extends MyDecorator{

    public SortDecorator(SchoolScore score) {
        super(score);
    }
    private void getSort() {
        System.out.println("我在班里的排名是：第十...");
    }
    @Override
    public void report() {
        //先报完成绩
        super.report();
        //再说明名次。
        this.getSort();
    }
}