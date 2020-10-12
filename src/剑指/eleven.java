package 剑指;

public class eleven {
    //二进制中一的个数
    public static void main(String[] args) {
          System.out.println(eleven.numberofBin(14));
    }
    public static int numberofBin(int n){
      int count=0;
      while(n!=0){
          count++;
          n=(n-1) & n;
      }
     return count;
    }
}
