package 力扣;

import java.util.Stack;

public class demo10 {
    public static void main(String[] args) {
        String s = "()[{}]";
        System.out.println(demo10.isValid(s));
    }

    public static boolean isValid(String s) {
        //1.特判
        if (s.isEmpty()) return true;
        //2.创建辅助栈
        Stack<Character> stack = new Stack<>();
        //3.遍历
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        //4.返回
        return stack.isEmpty();
    }
}
