package 字符串;

public class demo4 {
    //统计字符串的单词数
    public static void main(String[] args) {
     String s=" Java    is  very   important ";
    System.out.println(s.trim().isEmpty()?0:s.trim().split("\\s+").length);

    }
}
