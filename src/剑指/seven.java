package 剑指;

import java.util.ArrayList;
import java.util.List;

public class seven {
    //菲波那切数列
    public static void main(String[] args) {
         seven.a(2).forEach(l->{
             System.out.print(l+" ");
         });
    }
    public static List a(int n){
        List l=new ArrayList();
        if(n<2) {
            l.add(n);
            return l;
        }
        int one=0,two=1;
        int tmp=0;
        l.add(two);
        for(int i=2;i<=n;i++){
            tmp=one+two;
            one=two;
            two=tmp;
            l.add(tmp);
        }
        return l;
    }
}
