package huangrenhe;

public class kuaipai {
    public static void main(String[] args) {
       int[] arr={3,45,34,765,76,9,2,69};
       kuaipai.kai_Pac(arr,0,arr.length-1);
       for (int i=0;i<arr.length;i++){
           System.out.println(arr[i]+"");
       }
    }

    public static void kai_Pac(int[] arr, int left, int right){
        if (left>right){return;}
       int i=left;
       int j=right;
       int base = arr[left];
       while (i!=j){
           while (arr[j]>=base&&i<j){
               j--;
           }
           while (arr[i]<=base&&i<j){
               i++;
           }
           int tmp=arr[i];
           arr[i]=arr[j];
           arr[j]=tmp;
       }
       arr[left]=arr[i];
       arr[j]=base;
       kai_Pac(arr,left,i-1);
       kai_Pac(arr,j+1,right);

    }
}
