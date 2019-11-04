package 剑指;

public class thirty_two {
    public static void main(String[] args) {
        thirty_two t=new thirty_two();
        System.out.println(t.NumberOf1Between1AndN_Solution(100));
    }
    public int NumberOf1Between1AndN_Solution(int n) {
        int count=0;
        while(n>0){
            String s=String.valueOf(n);
            char c[]=s.toCharArray();
            for(int i=0;i<c.length;i++){
                if(c[i]=='1'){
                    count++;
                }
            }
            n--;
        }
        return count;
    }

}
