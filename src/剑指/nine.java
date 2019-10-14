package 剑指;

public class nine {
    public static void main(String[] args) {
   System.out.println(nine.jump(2));
    }
    public static int jump(int targe){
        if(targe ==0 || targe ==1){
            return targe;
        }
        int a=1,b=0;
        for(int i=2;i<=targe;i++){
             b=a*2;
             a=b;
        }
        return b;
    }

}
