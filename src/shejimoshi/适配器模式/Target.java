package shejimoshi.适配器模式;

public interface Target {
    /**
     * 这是源类Adaptee中也有的方法
     */

    public void sampleOperation1();
    /**
     * 这是源类Adaptee中没有的方法
     */
    public void sampleOperation2();
}