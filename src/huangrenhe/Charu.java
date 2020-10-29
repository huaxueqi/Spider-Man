package huangrenhe;

public class Charu {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 23, 8, 9, 6, 0, 4};
        Charu.b(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void chaPai(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    j--;
                } else {
                    break;
                }
            }

        }
    }

    static void b(int[] a) {
        for(int i=0;i<a.length;i++){
            int k=i;
            while(k>0){
                if(a[k]<a[k-1]){
                    int t=a[k];
                    a[k]=a[k-1];
                    a[k-1]=t;
                    k--;
                }else{
                    break;
                }
            }
        }
    }


}
