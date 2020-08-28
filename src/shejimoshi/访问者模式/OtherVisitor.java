package shejimoshi.访问者模式;

public class OtherVisitor implements Visitor {
    @Override
    public void visitor(Subject subject) {
        System.out.println("OtherVisitor 访问的属性值为：" + subject.getField());
    }
}