package 剑指;

public class ten {
    public static void main(String[] args) {
           System.out.println(ten.matrix(2));
    }
    public static int matrix(int targe){
        if(targe == 1 || targe == 2)
            return targe;
        int a=0,b=1,sum=0;
        for(int i=2;i<=targe;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
}
