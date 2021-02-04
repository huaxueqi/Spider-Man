package 从0开始;

public class majorityElement {
    public static int majorityElement1(int[] nums) {
        int count=0;
        int t=0;
        for(int x:nums){
            if(count==0)
                t=x;
            count=(x==t)?count+1:count-1;
        }
        return t;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement.majorityElement1(new int[]{2,2,1,1,1,2,2}));
    }
}
