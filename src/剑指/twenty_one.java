package 剑指;

import java.util.Stack;

/**
 * 定义栈的数据结构，写一个能够得到最小元素的min函数
 */
public class twenty_one {
    //入栈时比较
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public void push(int node){
        stack.push(node);
        if(min.isEmpty() || min.peek()>node){
            min.push(node);
        }
    }
    public void pop(){
        if(min.peek() == stack.peek()){
           min.pop();
        }
         stack.pop();
    }
    public int min(){
        return min.peek();
    }
    public int top(){
        return stack.peek();
    }
}
