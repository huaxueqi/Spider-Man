package shejimoshi.适配器模式;

public class Adapter {
    private Adaptee adaptee;

    public Adapter (Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 源类Adaptee有方法sampleOperation1
     * 因此适配器可以直接进行委派
     */
    public void sampleOperation1() {
        this.adaptee.sampleOperation1();
    }

    /**
     * 源类Adaptee没有方法sampleOperation2
     * 因此适配器需要自己实现此方法
     */
    public void sampleOperation2() {
        System.out.println("Operation 2nd");
    }
}