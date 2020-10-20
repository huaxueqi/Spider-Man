package 力扣;

import java.util.Arrays;

public class FB_N_Q {
    public static void main(String[] args) {
        FB_N_Q.shuzu(10);
    }

    public int Fibonacci(int n) {
        if (n < 2)
            return n;
        int a = 0, b = 1, s = 0;
        for (int i = 0; i <= n; i++) {
            s = a + b;
            a = b;
            b = s;
        }
        return s;
    }

    public static void shuzu(int n) {
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 1;

        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        System.out.println(Arrays.toString(a));
    }
}
