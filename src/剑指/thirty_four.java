package 剑指;

import java.util.ArrayList;

public class thirty_four {
    public static void main(String[] args) {

    }
    public int GetUglyNumber_Solution(int index) {
        if(index<7)
            return index;
        int p2=0,p3=0,p5=0,num=1;
        ArrayList<Integer> list=new ArrayList();
        while(index>list.size()){
            num=Math.min(list.get(p2)*2,Math.min(list.get(p3)*3,list.get(p5)*5));
            if(list.get(p2)*2== num) p2++;
            if(list.get(p3)*3== num) p3++;
            if(list.get(p5)*5== num) p5++;
            list.add(num);
        }
        return num;
    }
}
