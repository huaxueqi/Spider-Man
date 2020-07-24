package 字符串;

public class demo1 {
    public static void main(String[] args) {
        String s="产生了&ldquo;小种大熊猫&rdquo;这个新物种。";
        System.out.println(s.replaceAll("&ldquo;|&rdquo;",""));
    }
}
