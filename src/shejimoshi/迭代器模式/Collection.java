package shejimoshi.迭代器模式;

public interface Collection {
    public Iterator iterator();

    /**取得集合中的某个元素 */
    public Object get(int i);

    /**取得集合大小 */
    public int size();
}

