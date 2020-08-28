package shejimoshi.原型模式克隆;

public class Prototype implements Cloneable {
    private int age;
    private int[] array = new int[] { 1, 2, 3 };

    public Prototype() {
    }

    public Prototype(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    /**
     * 因为Cloneable接口是个空接口
     *
     * 此处的重点是super.clone()这句话，super.clone()调用的是Object的clone()方法，而在Object类中，clone()是native的
     *
     * 这就涉及到JNI，关于JNI还有NDK以后会讲到，这里你只要记住浅复制的核心是super.clone()。
     */
    public Object cloneObject() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }
}