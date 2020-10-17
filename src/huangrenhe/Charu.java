package huangrenhe;

public class Charu {
    public static void main(String[] args) {
        int[] arr={3,5,4,23,8,9,6,0,4};
        Charu.chaPai(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
    public static void chaPai(int[] arr){
        int temp;
        for (int i=0;i<arr.length;i++){
            int j=i;
            while (j>0){
                if (arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
                }else {
                    break;
                }
            }
        }

    }
}
