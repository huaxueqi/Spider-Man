package huangrenhe;

import java.util.Arrays;

public class T1 {
    public static void main(String[] args) {
        String s = "3,1,2,4";
        System.out.println(T1.zhongweishu(s));
    }

    public static int zhongweishu(String s) {
        String[] c = s.split(",");
        int[] arr = new int[c.length];
        int i = 0;
        for (; i < c.length; i++) {
            arr[i] = Integer.parseInt(c[i]);
        }
        Arrays.sort(arr);
        if (i % 2 == 0) {
            return (arr[i / 2] + arr[(i / 2) - 1]) / 2;
        }
        return arr[i / 2];
    }
}
