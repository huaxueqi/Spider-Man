package shejimoshi.访问者模式;

public class MySubject implements Subject {
    private String name;

    public MySubject(String name) {
        this.name = name;
    }

    /**
     * 这是核心：接收【指定的访问者】来访问咱自身的MySubject类的状态或特征
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }

    @Override
    public String getField() {
        return name;
    }
}