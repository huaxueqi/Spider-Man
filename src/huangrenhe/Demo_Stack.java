package huangrenhe;

import java.util.Stack;

public class Demo_Stack {
    public static void main(String[] args) {
        String str="[]<>{}";
        Demo_Stack demo_stack = new Demo_Stack();
        System.out.println(demo_stack.Demo(str));
    }

    public  boolean Demo(String string) {
        Stack<Character> stack = new Stack<>();//栈
        if (string.isEmpty()){return true ;}
        for (char c : string.toCharArray()) {
            if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '(') {
                stack.push(')');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
