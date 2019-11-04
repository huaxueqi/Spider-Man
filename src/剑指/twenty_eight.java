package 剑指;

import java.util.HashMap;
import java.util.Map;

public class twenty_eight {
    public static void main(String[] args) {
      int a[]={1,2,3,2,2,2,5,4,2};
        twenty_eight t=new twenty_eight();
        System.out.println(t.MoreThanHalfNum_Solution(a));
    }
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> m=new HashMap();
        for(int i=0;i<array.length;i++){
            m.put(array[i],m.containsKey(array[i])?m.get(array[i])+1:1);
        }
        int n=array.length;
        int max=0;
        for(Map.Entry<Integer,Integer>e:m.entrySet()){
                   if(e.getValue()>n/2){
                       max=e.getKey();
                   }
        }
        return max;
    }
}
