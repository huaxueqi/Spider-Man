package huangrenhe;

import java.util.Arrays;

public class median {
    public static void main(String[] args) {
        String string = "1,6,8,7,8,9";
        System.out.println(median.median_calculate(string));
    }

    public static double median_calculate(String string){
        String[] str = string.split(",");//逗号分隔
        double[] arr = new double[str.length];//定义相同长度的double类型数组
        int i=0;
        for (;i<str.length;i++){
            arr[i]= Double.parseDouble(str[i]);//赋值
        }
        Arrays.sort(arr);//排序
        if (i%2==0){
            return (arr[i/2]+arr[(i/2)-1])/2;
        }
        return arr[i/2];
    }
}
