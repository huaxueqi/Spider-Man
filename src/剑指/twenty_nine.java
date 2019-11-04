package 剑指;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class twenty_nine {
    public static void main(String[] args) {
       int a[]={4,5,1,6,2,7,3,8};
        twenty_nine.quickSort(a);
       /* for(int i:a){
            System.out.print(i+"   ");
        }*/
        twenty_nine t=new twenty_nine();
        t.GetLeastNumbers_Solution(a,4).forEach(l->{
            System.out.print(l);
        });
    }
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        List<Integer> list=new ArrayList<>();
        if(k>=input.length){
             list=Arrays.stream(input).boxed().collect(Collectors.toList());
        }else{
        for(int i=0;i<k;i++){
            list.add(input[i]);
          }
        }
        return (ArrayList)list;
    }
    public static void quickSort(int[] a) {
        if(a.length>0){
            quickSort(a,0,a.length-1);
        }
    }
    public static void quickSort(int[] a,int left,int right) {
        if(left>right)
            return;
         int i=left;
         int j=right;
         int key=a[right/2];
         while(i<j){
             while(key<a[j] && i<j){
                  j--;
             }
             while(key>a[i] && i<j){
                 i++;
             }
             if(i<j) {
                 int t = a[i];
                 a[i] = a[j];
                 a[j] = t;
             }
         }
         if(a[i]<a[left]) {
             int t = a[i];
             a[i] = a[left];
             a[left] = t;
         }
         quickSort(a,left,i-1);
         quickSort(a,i+1,right);
    }
    public static void sort(int []x ,int head,int foot) {
        int i = head;
        int j = foot;
        while (i < j) {
            int key = x[(j-i)/2];
            while (i < j && x[j] > key) {
                j--;
            }
            if (x[j] <= key) {
                int temp = x[j];
                x[j] = x[i];
                x[i] = temp;
            }
            while (i < j && x[i] < key) {
                i++;
            }
            if (x[i] <= key) {
                int temp = x[j];
                x[j] = x[i];
                x[i] = temp;
            }
        }
        if (i > head) {
            sort(x, head, i - 1);
        }
        if (j < foot) {
            sort(x, j + 1, foot);
        }
    }

  /*  public static void sort(int []x ,int head,int foot) {
        int i = head;
        int j = foot;
        while(i<j) {
            int key = x[(j-i)/2];
            while(i<j&&x[j]>key) {
                j--;
            }
            if(x[j]<=key) {
                int temp = x[j];
                x[j] = x[i];
                x[i] = temp;
            }
            while(i<j&&x[i]<key) {
                i++;
            }
            if(x[i]<=key) {
                int temp = x[j];
                x[j] = x[i];
                x[i] = temp;
            }
        }
        if(i>head) {sort(x,head,i-1);}
        if(j<foot) {sort(x,j+1,foot);}*/
    }


