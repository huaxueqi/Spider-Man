package 力扣;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StringSUM {
    //后缀表达式的值
    public static void main(String[] args) {
        List<Character> c = new ArrayList();
        c.add('2');
        c.add('1');
        c.add('+');
        c.add('3');
        c.add('*');
        String s = "21+3*";
        String[] s1 ={"2","1","+","3","*"};
        System.out.println(StringSUM.getResult(c));
        System.out.println(StringSUM.getResult1(s));
    }

    public static int getResult(List<Character> list) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            char c = list.get(i);
            if (c >= '0' && c <= '9') { //当遇到操作数直接压栈
                stack.push(c + "");
            } else {//当遇到操作符的时候，从栈中弹出两个元素，然后根据运算符的不同做相应的运算，然后把运算结果压栈。
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                if (c == '+') stack.push(a + b + "");
                else if (c == '-') stack.push(a - b + "");
                else if (c == '*') stack.push(a * b + "");
                else stack.push(a / b + "");
            }
        }
        //最终栈中肯定只剩下一个元素，就是计算的结果。
        return Integer.parseInt(stack.pop());
    }

    public static int getResult1(String str) {
        char[] items = str.toCharArray();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < items.length; i++) {
            char c = items[i];
            if (c >= '0' && c <= '9') { //当遇到操作数直接压栈
                stack.push(c + "");
            } else {//当遇到操作符的时候，从栈中弹出两个元素，然后根据运算符的不同做相应的运算，然后把运算结果压栈。
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                if (c == '+') stack.push(a + b + "");
                else if (c == '-') stack.push(a - b + "");
                else if (c == '*') stack.push(a * b + "");
                else stack.push(a / b + "");
            }
        }
        //最终栈中肯定只剩下一个元素，就是计算的结果。
        return Integer.parseInt(stack.pop());
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (s.equals("-")) {
                stack.push(-stack.pop() + stack.pop());
            } else if (s.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (s.equals("/")) {
                int num1 = stack.pop();
                stack.push(stack.pop() / num1);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

}
