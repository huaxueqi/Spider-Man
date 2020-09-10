package 字符串;

public class demo7 {
    //不用第三个变量的情况下交换两个字符串？
    public static void main(String[] args) {
        String s1="aa";
        String s2="bbc";
        s1=s1.concat(s2);
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println(s1+"\n"+s2);
    }
}
