package shejimoshi.适配器模式;

public class Test {
    public static void main(String[] args) {
        Adaptee adaptee=new Adaptee();
        Adapter adapter=new Adapter(adaptee);
        adapter.sampleOperation1();
        adapter.sampleOperation2();
    }
}
