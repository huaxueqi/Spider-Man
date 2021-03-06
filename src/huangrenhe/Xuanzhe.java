package huangrenhe;

public class Xuanzhe {
    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 2, 7, 1, 9, 0, 45, 67, 23};
        Xuanzhe.b(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
    }

    public static void selectSort(int[] a) {
        // i;        // 有序区的末尾位置
        // j;        // 无序区的起始位置
        int min;    // 无序区中最小元素位置
        for (int i = 0; i < a.length; i++) {
            min = i; //假设 i 是最小的元素的下标
            // 找出"a[i+1] ... a[n]"之间的最小元素，并赋值给min。
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min])
                    min = j;
            }
            // 若min!=i，则交换 a[i] 和 a[min]。
            // 交换之后，保证了a[0] ... a[i] 之间的元素是有序的。
            if (min != i) {
                int tmp = a[i];
                a[i] = a[min];
                a[min] = tmp;
            }
        }
    }


    static void b(int[] a) {
        int min;
        for (int i = 0; i < a.length; i++) {
            min = i;
            for (int j = i; j < a.length; j++) {
                if (a[min] > a[j])
                    min = j;
            }
            if (min != i) {
                int t = a[i];
                a[i] = a[min];
                a[min] = t;
            }
        }
    }
}
