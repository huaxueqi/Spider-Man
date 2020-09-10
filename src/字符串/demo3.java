package 字符串;

public class demo3 {
    //字符串删除指定出现的字符
    public static void main(String[] args) {
        String s="chenmowanger";
        System.out.println(s.replaceAll(String.valueOf("n"),""));
    }
}
