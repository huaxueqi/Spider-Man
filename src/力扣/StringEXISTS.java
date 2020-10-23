package 力扣;

class StringEXISTS {

    public static void main(String[] args) {
        StringEXISTS s = new StringEXISTS();
        //s.a();
        System.out.println(s.isUnique("abcdef"));
        System.out.println(s.CheckPermutation("abc", "abc"));
        System.out.println(s.replaceSpaces("a  b  c"));
        System.out.println(s.canPermutePalindrome("abcbac"));
        System.out.println(s.oneEditAway("pales", "pleass"));
    }

    //判断字符串里有没有重复字符
    public boolean isUnique(String astr) {
        int[] a = new int[1000];
        for (char ch : astr.toCharArray()) {
            a[ch]++;
            if (a[ch] > 1) {
                return false;
            }
        }
        return true;
    }

    //判断两个字符是否一样
    public boolean CheckPermutation(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 != l2) {
            return false;
        }
        int[] a = new int[128];
        for (int i = 0; i < l1; i++) {
            a[s1.charAt(i)]++;
            a[s2.charAt(i)]--;
        }
        for (int index : a) {
            if (index != 0)
                return false;
        }
        return true;
    }

    //字符串替换空格
    public String replaceSpaces(String S) {
        if (S == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(S.charAt(i));
            }
        }
        return new String(sb);
    }

    //判断是否回文
    public boolean canPermutePalindrome(String s) {
        int[] a = new int[128];
        for (char ch : s.toCharArray()) {
            a[ch]++;
        }
        int flag = 0;
        for (int i : a) {
            if (i % 2 == 1) {//是奇数
                flag++;
            }
        }
        return flag <= 1;
    }

    //
    public boolean oneEditAway(String first, String second) {
        //判断长度差别是否满足一位以内
        int a = first.length() - second.length();
        if (Math.abs(a) > 1) {
            return false;
        }
        char[] c1 = first.toCharArray();
        char[] c2 = second.toCharArray();
        boolean flag = false;
        for (int i = 0, j = 0; i < c1.length && j < c2.length; i++, j++) {
            if (c1[i] == c2[j]) {
                continue;
            } else if (flag) {
                return false;
            }
            if (a == 1) {
                j--;
            } else if (a == -1) {
                i--;
            }
            flag = true;
        }
        return true;
    }

    void a() {
        String s = "";
        System.out.println(s.substring(0, 1));
    }
}