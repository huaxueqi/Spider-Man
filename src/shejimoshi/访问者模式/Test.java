package shejimoshi.访问者模式;

public class Test {
    public static void main(String[] args) {
        /**
         * 创建待访问的对象
         */
        Subject subject = new MySubject("张三");
        /**
         * 接受访问对象：这里只接收MyVisitor访问者对象，不接收OtherVisitor访问者对象
         */
        subject.accept(new MyVisitor());
        subject.accept(new OtherVisitor());
    }
}