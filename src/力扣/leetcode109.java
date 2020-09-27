package 力扣;

public class leetcode109 {
    //字符串轮转   自身加自身
    public static void main(String[] args) {

    }

    public boolean istrueorfalse(String s1, String s2) {
        return s1.equals(s2) || (s1.length() == s2.length() && (s1 + s1).contains(s2));
    }

    public boolean isFlipedString1(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return (s2 + s2).indexOf(s1) != -1;
    }

}
