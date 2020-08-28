package shejimoshi.访问者模式;

public interface Visitor {
    /**
     * 访问对象
     *
     * @param subject
     *            待访问的对象
     */
    public void visitor(Subject subject);
}