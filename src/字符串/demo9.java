package 字符串;

public class demo9 {
    //检查字符串包含数字
    public static void main(String[] args) {
       String s="123abc";
       System.out.println(s.matches("\\d+"));
    }
}
