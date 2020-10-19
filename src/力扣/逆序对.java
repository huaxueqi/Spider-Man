package 力扣;

import java.util.Arrays;

public class 逆序对 {
    public static void main(String[] args) {
        int[] a ={5,1,4,6,7,9,8,3};
        逆序对.merge(a,0,a.length-1);
    }
    public int reversePairs(int[] nums) {

        if (nums.length<=1)
            return 0;
        return sortMergeRecursionHelper(nums,0,nums.length-1);
    }

    public int sortMergeRecursionHelper(int[] nums, int left, int right){
        if (left==right)
            return 0;
        int mid = left+(right-left)/2;
        int l = sortMergeRecursionHelper(nums,left,mid);//记录左边的结果
        int r = sortMergeRecursionHelper(nums,mid+1,right);//记录右边的结果

        return l+r+mergeArr(nums,left,mid,right);//左加右加当前
    }

    public int mergeArr(int[] nums, int left, int mid, int right){
        int[] temp = new int[right-left+1];
        int i = left, j = mid+1, k=0;
        int count = 0;
        while (i<=mid && j<=right){
            if (nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else {
                temp[k++] = nums[j++];
                count += mid-i+1;
            }
        }
        while (i<=mid)
            temp[k++] = nums[i++];
        while (j<=right)
            temp[k++] = nums[j++];

        int index = 0;
        while (left<=right){
            nums[left++] = temp[index++];
        }
        return count;
    }

    //归并排序
    static void merge(int[] arr, int start, int end) {
        if (start >= end) return;
        int mid = start + (end - start) / 2;
        merge(arr, start, mid);
        merge(arr, mid + 1, end);

        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while(i <= mid && j <= end){
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        while(i <= mid)
            temp[k++] = arr[i++];
        while(j <= end)
            temp[k++] = arr[j++];
        //System.arraycopy(temp, 0, arr, start, end);
        int index = 0;
        while (start<=end){
            arr[start++] = temp[index++];
        }
        System.out.println(Arrays.toString(arr));
    }

   /* public int reversePairs(int[] nums) {
        return merge(nums, 0, nums.length - 1);
    }

    int merge(int[] arr, int start, int end) {
        if (start >= end) return 0;
        int mid = start + (end - start) / 2;
        int count = merge(arr, start, mid) + merge(arr, mid + 1, end);
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            count += arr[i] <= arr[j] ? j - (mid + 1) : 0;
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        while (i <= mid) {
            count += j - (mid + 1);
            temp[k++] = arr[i++];
        }
        while (j <= end)
            temp[k++] = arr[j++];
        int index = 0;
        while (start<=end){
            arr[start++] = temp[index++];
        }
        return count;
    }*/


}
