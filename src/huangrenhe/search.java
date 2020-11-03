package huangrenhe;

public class search {
    //二分查找，返回下标
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 6, 7, 8, 9};//二分查找必须是数组有序的情况下
        System.out.println(search.searchEF(a, 3));
    }

    static int searchEF(int[] arr, int flag) {
        int i=0,j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>flag) j=mid-1;
            else if(arr[mid]<flag) i=mid+1;
            else  return mid;
        }
        return -1;
    }

}
