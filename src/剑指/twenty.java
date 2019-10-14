package 剑指;

import java.util.ArrayList;

/**
 * 顺时针打印矩阵
 */
public class twenty {
    public static void main(String[] args) {
      int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      for(int t:twenty.solution(a)){
          System.out.println(t);
      }
    }
    public static  ArrayList<Integer> solution(int a[][]){
        ArrayList<Integer> list= new ArrayList<>();
        int r1=0,r2=a.length-1,c1=0,c2=a[0].length-1;
        while(r1<=r2 && c1<=c2){
            for(int i=c1;i<=c2;i++){
             list.add(a[r1][i]);
            }
            for(int i=r1+1;i<=r2;i++){
             list.add(a[i][c2]);
            }
            if(r1!=r2){
                for(int i=c2-1;i>=c1;i--){
                    list.add(a[r2][i]);
                }
            }
            if(c1 !=c2){
                for(int i=r2-1;i>r1;i--){
                    list.add(a[i][c1]);
                }
            }
            r1++;c1++;r2--;c2--;
        }
        return list;
    }
}
