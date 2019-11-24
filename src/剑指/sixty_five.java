package 剑指;

import java.util.ArrayList;

public class sixty_five {
    public static void main(String[] args) {


}
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(num.length<size||size<1) return list;
        for(int i=0;i<num.length-size+1;i++){
            int max=num[i];
            for(int j=1;j<size;j++)
                if(max<num[i+j]) max=num[i+j];
            list.add(max);
        }
        return list;
    }
}
