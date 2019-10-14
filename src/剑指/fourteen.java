package 剑指;

import java.util.ArrayList;

/**
 * 调整数组顺序使奇数位于偶数前面
 */
public class fourteen {
    public static void main(String[] args) {
          int a[]={2,5,6,3,2,8,7,9,6,5,10};
        ArrayList<Integer> ji=new ArrayList<Integer>();
        ArrayList<Integer> ou=new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                ou.add(a[i]);
            }else{
                ji.add(a[i]);
            }
        }
        for(int i=0;i<ji.size();i++){
            a[i]=ji.get(i);
        }
        for(int j=0;j<ou.size();j++){
            a[j+ji.size()]=ou.get(j);
        }
          for(int t :a){
              System.out.print(t+"   ");
          }
     }
}

