package 力扣;

class dome1 {
    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个整数，
     * 并返回他们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     * @param args
     */
    public static void main(String[] args) {
        int a[]={2,5,5,11};
        int t=10;
        dome1 d=new dome1();
        d.twoSum(a,t);
        System.out.println(d.twoSum(a,t)[0]);
        System.out.println(d.twoSum(a,t)[1]);
    }
    public int[] twoSum(int[] nums, int target) {
        int t[]=new int [2];
        int t1=0,t2=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j] ==target){
                 t1=i;
                 t2=j;
                    t[0]=t1;
                    t[1]=t2;
                    return t;
                }
            }
        }
    return t;
    }
}

