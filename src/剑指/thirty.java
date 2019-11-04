package 剑指;

public class thirty {
    public static void main(String[] args) {
    int a[]={6,-3,-2,7,-15,1,2,2};
        thirty t=new thirty();
        System.out.println(t.FindGreatestSumOfSubArray(a));
    }
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array==null || array.length==0){
            return 0;
        }
        int max=array[0];
        int sum=0;
        for(int i=0;i<array.length;i++){
            if(sum<=0){
                sum=array[i];
            }else{
                sum+=array[i];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
