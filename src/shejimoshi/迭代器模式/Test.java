package shejimoshi.迭代器模式;

public class Test {
    public static void main(String[] args) {
        /**
         * 实例化容器
         */
        Collection collection = new MyCollection();
        /**
         * 创建迭代器
         */
        //Iterator iterator = new MyIterator(collection);
        Iterator iterator = collection.iterator();

        /**
         * 遍历集合中的元素
         */
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}