package 剑指;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
 */
public class thirty_six {
    public static void main(String[] args) {

    }
    public int InversePairs(int [] array) {
        int[] cp = new int[array.length];
        for(int i=0;i<array.length;i++){
            cp[i] = array[i];
        }
        return mergeSort(array,cp,0,array.length-1);
    }

    public int mergeSort(int[] num,int[] cp,int start,int end){
        if(start==end){
            cp[start] = num[start];
            return 0;
        }
        int count = 0;
        int mid = (start+end)/2;
        count += mergeSort(num,cp,start,mid);
        count += mergeSort(num,cp,mid+1,end);
        int i = mid;
        int j = end;
        int index = end;
        while(i>=start && j>=mid+1){
            if(num[i]>num[j]){
                cp[index--] = num[i--];
                count += (j-mid);
                if(count>=1000000007)count = count%1000000007;
            }else{
                cp[index--] = num[j--];
            }
        }
        while(i>=start){
            cp[index--] = num[i--];
        }
        while(j>=mid+1)
            cp[index--] = num[j--];

        for(int k=start;k<=end;k++){
            num[k] = cp[k];
        }
        return count;
    }

}
