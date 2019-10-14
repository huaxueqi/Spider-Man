package 深拷贝;

public class shenClone {
   static class A implements Cloneable{
        int i = 20;
        A(){}
        A(int i){
            this.i = i;
        }
        public Object clone() throws CloneNotSupportedException{
            A a = null;
            a = (A) super.clone();
            return a;
        }
    }
    static  class  T implements Cloneable {
        private int i = 10;
        private A a = new A(11);
        public Object clone ()  throws CloneNotSupportedException{
            T b = null;
            b = (T) super.clone();
            return b;
        }
        public A getA() {
            return a;
        }
        public void setA(A a) {
            this.a = a;
        }
    }
    public static void main(String[] args)throws CloneNotSupportedException {
        T b = new T();
        // 执行浅拷贝
        System.out.println("执行浅拷贝：");
        T cb1 = (T)b.clone();
        System.out.println(cb1.equals(b));// false-表示clone的对象与原对象不同
        System.out.println((cb1.getA()).equals(b.getA()));// true-表示浅拷贝引用对象不变
        // 执行深拷贝
        System.out.println("----------------");
        System.out.println("执行深拷贝：");
        T cb2 = (T)b.clone();
        A ca = (A)b.getA().clone();
        cb2.setA(ca);
        System.out.println(cb2.equals(b));// false-表示clone的对象与原对象不同
        System.out.println((cb2.getA()).equals(b.getA()));// true-表示浅拷贝引用对象不变
    }
}
