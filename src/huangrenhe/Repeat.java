package huangrenhe;

import java.util.HashSet;
import java.util.Set;

public class Repeat {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,5,6,7};
        System.out.println(Repeat.checkRepeat(arr));
    }

    public static boolean checkRepeat(int[] arr){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }
        if (hashSet.size()==arr.length) {
            return true;
        } else {
            return false;
        }


    }
}
