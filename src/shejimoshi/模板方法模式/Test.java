package shejimoshi.模板方法模式;

public class Test {
    public static void main(String[] args) {
        AbstractTemplate at1 = new Sub1();
        at1.haveMeal();
        System.out.println("\n");
        AbstractTemplate at2 = new Sub2();
        at2.haveMeal();
    }
}