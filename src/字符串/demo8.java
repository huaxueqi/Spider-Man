package 字符串;

import java.util.ArrayList;
import java.util.List;

public class demo8 {
    //如何从字符串中找出第一个不重复的字符？
    public static void main(String[] args) {
    System.out.println(demo8.chongfu());
    }
    public static  Character chongfu(){
        char[] chars = "gadsghdhadweewg".toCharArray();
        List list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (list.contains(c)) {
                continue;
            }
            for (int j = i + 1; j < chars.length; j++) {
                if (c == chars[j]) {
                    list.add(chars[j]);
                    break;
                } else if (j == chars.length - 1) {
                    return c;
                }
            }
        }
        return null;
    }
       
}
