package 力扣;

class dome1 {
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

