package 剑指;

public class forty_eight {
    //n 的阶乘
    public static void main(String[] args) {

    }
    public int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (n>0)&&((sum+=Sum_Solution(n-1))>0);
        return sum;
    }
}
