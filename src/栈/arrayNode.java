package 栈;

public class arrayNode {
    private Object[] val = null;
    private int top = 0;
    private int maxSize = 0;

    arrayNode() {
        this.maxSize = 10;
    }

    arrayNode(int initSize) throws Exception {
        if (initSize <= 0) {
            throw new Exception("栈容量必须大于 0");
        } else {
            val = new Object[initSize];
            maxSize = initSize;
            top = 0;
        }
    }

    public boolean push(Object e) throws Exception {
        if (maxSize <= top) {
            throw new Exception("入栈失败，栈已满");
        } else {
            val[++top] = e;
            return true;
        }
    }

    public Object pop() throws Exception {
        if (top <= 0) {
            throw new Exception("移除失败，栈中已无数据");
        } else {
            return val[top--];
        }
    }

    public Object peep() throws Exception {
        if (top <= 0) {
            throw new Exception("移除失败，栈中已无数据");
        } else {
            return val[top];
        }
    }

    public static void main(String[] args) throws Exception {
        arrayNode stack = new arrayNode(10);
        stack.push("Hello");
        stack.push("Java");
        System.out.println(stack.peep());
        stack.pop();
        System.out.println(stack.pop());
    }
}
