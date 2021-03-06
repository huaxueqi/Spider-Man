package huangrenhe;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        /*int[] arr={3,6,4,8,5,2,0};
        Demo.DemoTest(arr);
        for (int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }*/
        System.out.println(Demo.suger(15));
    }

    public static void DemoTest(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
       static int suger(int sum){
            int count=1;
            if(sum==0){
                return count;
            }
            if(sum%2 != 0 ){
                sum=sum+1;
            }
            while(sum!=1){
                sum=sum/2;
                count++;
            }
            return count;
        }


    void d(){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

    }

}
