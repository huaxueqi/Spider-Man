package 剑指;

public class six {
    public static void main(String[] args) {
        int [] array={2,2,3,4,5,6,6};
        int low=0,hight=array.length-1;
        while(low<=hight){
            int mid=hight/2;
            if(array[mid]>array[hight]){
                 low=mid+1;
            }else if(array[mid] == array[hight]){
                 hight=hight-1;
            }else{
              hight=mid;
            }
        }
        System.out.println(array[low]);
    }
}
