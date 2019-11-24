package 剑指;

public class fifty_two {
    public static void main(String[] args) {

    }
    public int[] multiply(int[] A) {
        int[] b = new int[A.length];
        if (A.length > 0) {
            b[0] = 1;
            // 计算左边
            for (int i = 1; i < A.length; i++) {
                b[i] = b[i - 1] * A[i - 1];
            }
            // 计算右边
            for (int j = A.length - 2, temp = 1; j >= 0; j--) {
                temp = temp * A[j + 1];
                b[j] = b[j] * temp;
            }
        }
        return b;
    }
}
