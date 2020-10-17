package huangrenhe;

public class FastQuery {

    public static void fastQuery(int[] arr, int left, int right){
        if (left>right){return;}
        int i = left;
        int j = right;
        //int base = arr[(left+right)/2];
        int base = arr[left];//定义基准数，始终为最左边的数
        while (i!=j){
            while (arr[j]>=base&&i<j){
                j--;
            }
            while (arr[i]<=base&&i<j){
                i++;
            }
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
        }
        arr[left]=arr[i];//相遇位置数赋值给基准数位置
        arr[i]=base;//基准数赋值给相遇的位置

        fastQuery(arr, left, i-1);
        fastQuery(arr, i+1, right);
    }

    public static void main(String[] args) {
        int[] arr={3,45,34,765,76,9,2,69};
        fastQuery(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}

