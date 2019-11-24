package 剑指;

public class forty_seven {
    public static void main(String[] args) {

          }
    public int LastRemaining_Solution(int n, int m) {
        if(n==0||m==0)return -1;
        int s=0;
        for(int i=2;i<=n;i++)
        {
            s=(s+m)%i;
        }
        return s ;
    }
}
