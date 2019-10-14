package 剑指;

import java.math.BigInteger;

/**
 * 打印1-n
 */
public class thirteen {
    public static void main(String[] args) {
        BigInteger B= new BigInteger("125895785");
        printfn(B);

    }
    public static void printfn(BigInteger n) {
        BigInteger i=new BigInteger(String.valueOf(0));
        while(true){
            i=i.add(BigInteger.valueOf(1));
            //System.out.print(i+"  ");
            if(i.equals(n)){
                break;
            }
        }
        System.out.println(i);
    }
}
