package shejimoshi.模板方法模式;

public class Sub2 extends AbstractTemplate {

    @Override
    public void zhuFan() {
        System.out.println("使用高压锅煮饭...");

    }

    @Override
    public void shaoCai() {
        System.out.println("使用电磁炉烧菜...");
    }
}
