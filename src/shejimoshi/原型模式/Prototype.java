package shejimoshi.原型模式;

public interface Prototype {
    public Prototype clone();
    public String getName();
    public void setName(String name);
}