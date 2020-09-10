package 字符串;

public class demo6 {
    //判断一个字符串包含另一个字符串
    public static void main(String[] args) {
        String a="aaabbb";
        String b="aaabbb";
        System.out.println(a.indexOf(b));
        System.out.println(a.contains(b));
    }
}
