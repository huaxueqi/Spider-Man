package huangrenhe;

import java.util.Arrays;

public class 归并排序 {
    public static void main(String[] args) {
        int[] arr = {3, 45, 34, 765, 76, 9, 2, 69};
        归并排序.b(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void b(int[] a, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        b(a, left, mid);
        b(a, mid + 1, right);
        int[] t = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            t[k++] = a[i] <= a[j] ? a[i++] : a[j++];
        }
        while (i <= mid) {
            t[k++] = a[i++];
        }
        while (j <= right) {
            t[k++] = a[j++];
        }
        int index = 0;
        while (left <= right) {
            a[left++] = t[index++];
        }
    }
}
