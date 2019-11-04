package 剑指;

import java.util.*;
import java.util.stream.Collectors;

public class thirty_three {
    public static void main(String[] args) {
        thirty_three t=new thirty_three();
        int a[]={3,32,321};
       System.out.println(t.PrintMinNumber(a));
    }
    public String PrintMinNumber(int[] numbers) {
       String s="";
        List<Integer> list=new ArrayList();
        list=Arrays.stream(numbers).boxed().collect(Collectors.toList());
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1=o1+""+o2;
                String s2=o2+""+o1;
                return  s1.compareTo(s2);
            }
        });
        for(int j:list){
            s+=j;
        }
        return s;
    }
}
