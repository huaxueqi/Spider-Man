package 剑指;

import java.util.Arrays;

public class forty_six {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length==0) return false;
        Arrays.sort(numbers);
        int zero=0;
        int interval=0;
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]==0){
                zero++;
                continue;
            }
            if(numbers[i]==numbers[i+1]){
                return false;
            }
            interval += numbers[i+1]-numbers[i]-1;
        }
        if(zero>=interval) return true;
        return false;
    }
}
