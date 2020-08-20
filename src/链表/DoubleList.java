package 链表;

public class DoubleList<T> {
    class DoubleNode<T> {

        public T data;//数据域
        public DoubleNode<T> prev;//前驱结点
        public DoubleNode<T> next;//后继结点

        /**
         * 创建一个空结点
         */
        public DoubleNode() {
            this(null, null, null);
        }

        public DoubleNode(DoubleNode<T> prev, T data, DoubleNode<T> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }

    public DoubleNode<T> head;

    public DoubleList() {
        head = new DoubleNode<T>();// 创建空头结点,data和prev、next为null
    }

    /**
     * 判断双向链表是否为空
     */
    public boolean isEmpty() {
        return this.head.next == null;
    }

    /**
     * 链表长度
     */
    public int size() {
        int length = 0;
        DoubleNode<T> p = this.head.next;
        while (p != null) {
            length++;
            p = p.next;
        }
        return length;
    }

    /**
     * 定位第i个结点数据
     *
     * @return
     */
    public DoubleNode<T> locationNode(int i) {

        if (i < 0 || i > size()) {
            throw new IndexOutOfBoundsException("位置 i 没有找到，无法定位");
        } else {
            DoubleNode<T> p = this.head.next;
            int index = 0;
            while (p != null) {
                if (i == index) {
                    return p;
                }
                index++;
                p = p.next;

            }
        }
        return null;
    }

    /**
     * 将新结点插入到链表结尾
     */
    public void insert(T data) {
        if (data == null) {
            throw new NullPointerException("data = null");
        }

        DoubleNode<T> newNode = new DoubleNode<T>(null, data, null);
        DoubleNode<T> p = this.head.next;
        if (p == null) {
            head.next = newNode;
            newNode.prev = head;
        } else {
            p = locationNode(size() - 1);//链表最后的结点位置是size-1
            p.next = newNode;
            newNode.prev = p;
        }
    }

    /**
     * 将新结点插入第i个位置，相当于在原i结点之前插入
     *
    */
    public void insert(int i, T data) {
        if (data == null) {
            throw new NullPointerException("data = null");
        }
        DoubleNode<T> p;
        DoubleNode<T> newNode = new DoubleNode<T>(null, data, null);
        if (isEmpty()) {//如果链表为空，则插入第0个结点
            p = head.next;
            p.next = newNode;
            newNode.prev = p;
        } else {
            p = locationNode(i);//定位第i个结点位置，新结点插入p结点之前

            newNode.prev = p.prev;
            newNode.next = p;
            p.prev.next = newNode;
            p.prev = newNode;

            newNode.prev = p.prev;
            p.prev.next = newNode;
            newNode.next = p;
            p.prev = newNode;

        }
    }


    /**
     * 删除第i个结点
     */
    public void delete(int i) {

        if (i < 0 || i > size()) {
            throw new IndexOutOfBoundsException("位置 i 没有找到，无法删除");
        }

        if (isEmpty()) {
            throw new NullPointerException("链表为空");
        } else {
            DoubleNode<T> p = locationNode(i);//定位第i个结点位置
            p.prev.next = p.next;
            p.next.prev = p.prev;
        }

    }

    /**
     * 遍历双向链表
     */
    public void display() {
        DoubleNode<T> p = this.head.next;
        if (p == null) {
            System.out.println("DoubleList is null");
        } else {
            while (p != null) {
                System.out.print(p.data.toString() + " ");
                p = p.next;
            }
        }
    }

    public static void main(String[] args) {
        DoubleList<String> list = new DoubleList<String>();
        list.insert("a");
        list.insert("b");
        list.insert("c");
        list.insert("d");
        list.insert("e");

        list.delete(1);

        list.insert(2,"a");
        System.out.println(list.size());
        list.display();
    }

}