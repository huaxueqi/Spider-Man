package shejimoshi.迭代器模式;

public class MyCollection implements Collection {
    private String[] strArray = { "aa", "bb", "cc", "dd" };

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return strArray[i];
    }

    @Override
    public int size() {
        return strArray.length;
    }

}