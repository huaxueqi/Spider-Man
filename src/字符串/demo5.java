package 字符串;

import java.util.Set;
import java.util.stream.Collectors;

public class demo5 {
    //检查字符串中的两个字符是相等的
    public static void main(String[] args) {
        String s1 = "沉默王二";
        String s2 = "沉默王二";
        Set set1=s1.chars().mapToObj(c->(char)c).collect(Collectors.toSet());
        Set set2=s2.chars().mapToObj(c->(char)c).collect(Collectors.toSet());
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set1.equals(set2));

    }
}
