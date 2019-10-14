package 剑指;
import java.lang.Math;

/**
 *
 */
public class twelve {
    public static void main(String[] args) {
        System.out.println(twelve.mi(10,-2));
    }
    public static  double mi(int base,int exp){
         if(exp==0)
             return 1;
         double result=1;
         for(int i=0;i<Math.abs(exp);i++ ){
            result *=base;
        }
        return exp<1 ?1/result:result;
    }
}
