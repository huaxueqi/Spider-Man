package huangrenhe;

public class Test {

    public static void FastQuery(int[] arr,int left,int right){
        if (left>right){return;}
        int i=left;
        int j=right;
        int base=arr[left];
        while (i!=j){
            while (arr[j]>=base&&i<j){
                j--;
            }
            while (arr[i]<=base&&i<j){
                i++;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        arr[left]=arr[i];
        arr[i]=base;

        FastQuery(arr,left,i-1);
        FastQuery(arr,j+1,right);
    }

    public static void main(String[] args) {
        int[] arr={6,4,8,9};
        FastQuery(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
