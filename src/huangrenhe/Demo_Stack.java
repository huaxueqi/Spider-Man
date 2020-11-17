package huangrenhe;

import java.util.Stack;

public class Demo_Stack {
    public static void main(String[] args) {
        String str = "[](){}";
        Demo_Stack demo_stack = new Demo_Stack();
        System.out.println(demo_stack.Demo(str));
        System.out.println(demo_stack.if_pipei(str));
    }

    public boolean Demo(String string) {
        Stack<Character> stack = new Stack<>();//栈
        if (string.isEmpty()) {
            return true;
        }
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

    boolean if_pipei(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }else if(c=='('){
                stack.push(')');
            }else if(stack.isEmpty() || stack.pop() !=c){
                return false;
            }
        }
        return stack.isEmpty();
    }

}
