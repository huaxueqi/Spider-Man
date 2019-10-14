package 剑指;

import java.util.Stack;

public class twenty_two {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int []b={4,5,3,2,1};
        System.out.println(twenty_two.IsPopOrder(a,b));
    }
    public static boolean IsPopOrder(int []a,int b[]){
        Stack<Integer> t=new Stack<>();
        for(int i=0,f=0;i<a.length;i++){
            t.push(a[i]);
            while (!t.isEmpty() && t.peek()==b[f]){
                  t.pop();
                  f++;
            }
        }
        return t.isEmpty();
    }
}
