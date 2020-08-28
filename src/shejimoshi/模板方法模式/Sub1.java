package shejimoshi.模板方法模式;

public class Sub1 extends AbstractTemplate {

    @Override
    public void zhuFan() {
        System.out.println("使用电饭煲煮饭...");

    }

    @Override
    public void shaoCai() {
        System.out.println("使用炉灶烧菜...");
    }
}
