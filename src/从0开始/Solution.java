package 从0开始;

import java.util.Arrays;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        for(int i=m;i< nums1.length;i++){
            nums1[i]=nums2[k];
            k++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        Solution.merge(nums1,m,nums2,n);
    }
}