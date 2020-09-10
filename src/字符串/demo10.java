package 字符串;

public class demo10 {
    //如何实现字符串的深度拷贝?
    public static void main(String[] args) {
       String s="asdgasd";
       String b=s;
       System.out.println(b==s);
       System.out.println(b.equals(s));
    }
}
