package 剑指;

import java.util.HashMap;

public class four_one {
    public static void main(String[] args) {

    }

        public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i : array) {
                if (hashMap.containsKey(i)) {
                    int time = hashMap.get(i);
                    time++;
                    hashMap.put(i, time);
                } else {
                    hashMap.put(i, 1);
                }
            }

            for (int j : array) {
                if (hashMap.get(j) == 1 && num1[0] == 0 && num2[0] == 0) {
                    num1[0] = j;
                }
                if (hashMap.get(j) == 1 && num1[0] != 0) {
                    num2[0] = j;
                }
            }
        }
    }
