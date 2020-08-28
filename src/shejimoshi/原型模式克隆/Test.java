package shejimoshi.原型模式克隆;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype(20);
        Prototype cloneProto = (Prototype) prototype.cloneObject()  ;
        /**
         * 通过打印可以看到：prototype和cloneProto这两个同一类型的变量指向的是两个不同的内存地址
         *
         * 这说明克隆成功
         */
        System.out.println("prototype = " + prototype);
        System.out.println("cloneProto = " + cloneProto);
        /**
         * 要完全复制一个对象的话，那么它的引用类型变量array指向的肯定是不同的内存地址
         *
         * 而这里的引用类型变量array，指向的还是原对象所指向的。可以看到打印的内存地址是相同的。
         *
         * 这说明对象复制不彻底
         */
        System.out.println("prototype.getArray() = " + prototype.getArray());
        System.out.println("cloneProto.getArray() = " + cloneProto.getArray());
        /**
         * 透过这个例子可以看到：浅复制并没有将对象进行完全复制
         */
    }
}