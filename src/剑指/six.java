package 剑指;

public class six {
    public static void main(String[] args) {
        int [] array={6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,9170,9359,9719,9895,9896,9913,9962,154,293,334,492,1323,1479,1539,1727,1870,1943,2383,2392,2996,3282,3812,3903,4465,4605,4665,4772,4828,5142,5437,5448,5668,5706,5725,6300,6335};


        if(array.length==0)
            System.out.println(0);

        int low=0,hight=array.length-1;
        while(low<hight){
            int mid=low+(hight-low)/2;
            if(array[mid]>array[hight]){
                 low=mid+1;
            }else if(array[mid] == array[hight]){
                 hight=hight-1;
            }else{
              hight=mid;
            }
        }
        System.out.println(array[low]);
        System.out.println( six.minNumberInRotateArray(array));

    }
    public static int minNumberInRotateArray(int [] array) {
        int low = 0 ; int high = array.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else{
                high = mid;
            }
        }
        return array[low];
    }
}
