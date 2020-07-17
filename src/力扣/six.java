package 力扣;

public class six {
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
