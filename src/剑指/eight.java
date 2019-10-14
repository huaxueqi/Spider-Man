package 剑指;

public class eight {
    public static void main(String[] args) {
           System.out.println(eight.jump(10));
    }
    public  static int jump(int targe){
        if(targe ==0 || targe ==1 || targe ==2){
        return targe;
        }
        int one=1,two=2,sum=0;
        for(int i=3;i<=targe;i++){
            sum=one+two;
            one=two;
            two=sum;
        }
        return sum;
    }
}
