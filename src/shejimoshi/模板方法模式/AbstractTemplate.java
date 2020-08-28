package shejimoshi.模板方法模式;

public abstract class AbstractTemplate {

    public final void haveMeal() {
        zhuFan();
        shaoCai();
        duringMeal();
        finish();
    }

    public abstract void zhuFan();

    public abstract void shaoCai();

    public void duringMeal() {
        System.out.println("吃饭中...");
    }

    public void finish() {
        System.out.println("吃完了...");
    }
}