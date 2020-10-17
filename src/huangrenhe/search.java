package huangrenhe;

public class search {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 6, 7, 8, 9};//二分查找必须是数组有序的情况下
        System.out.println(search.searchEF(a, 6));
    }

    static int searchEF(int[] arr, int flag) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (arr[mid] == flag) {
                return mid;
            } else if (arr[mid] > flag) {
                j = mid - 1;
            } else if (arr[mid] < flag) {
                i = mid + 1;
            }
        }
        return i - 1;
    }

}
