package 力扣;

public class six {
    /**
     * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
     * 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，
     * 则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
     */
    public static void main(String[] args) {
             six s=new six();
             System.out.println(s.compressString("abbccd"));
    }
    public String compressString(String S) {
            if (S == null || S.length() <= 2) {
                return S;
            }
            StringBuilder sb = new StringBuilder().append(S.charAt(0));
            int cnt = 1;
            char[] c = S.toCharArray();
            for (int i=1;i<c.length;i++) {
                // 如果i与i-1相同，cnt累加
                if (c[i] == c[i - 1]) {
                    cnt++;
                } else {
                    // 否则拼接上i-1的次数，从i开始重新计数

                    sb.append(cnt).append(c[i]);
                    cnt = 1;
                }
            }
            return sb.append(cnt).length() < S.length()? sb.toString(): S;
        }
}
