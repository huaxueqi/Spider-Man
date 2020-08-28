package shejimoshi.责任链模式;

public class Test {
    public static void main(String[] args) {
        MyHandler handler1 = new MyHandler("技术总监");
        MyHandler handler2 = new MyHandler("项目经理");
        MyHandler handler3 = new MyHandler("程序员");
        /**
         * 如果没有下家，将会自行处理
         *
         * 打印结果：技术总监处理BUG...
         */
        handler3.operator();
        /**
         * 只要有下家，就传给下家处理

         * 下面的打印结果：技术总监，将BUG交给——>项目经理，将BUG交给——>程序员处理BUG...
         *
         * 就这样，原本是技术总监自行处理的BUG，现在一层一层的把责任推给了程序员去处理
         */
        handler3.setHandler(handler2);
        handler2.setHandler(handler1);
        /**
         * 透过打印结果可以知道：MyHandler实例化后将生成一系列相互持有的对象(handler)，构成一条链。
         */
        handler3.operator();
        /**
         * 【注意2】责任链不是链表：链表有个头结点，咱每次必须通过头结点才能访问后面的节点
         *
         * 而责任链它可以从头访问，也可以从中间开始访问，如：handler2.operator();
         */

    }
}