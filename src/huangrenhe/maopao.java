package huangrenhe;

public class maopao {
    public static void main(String[] args) {
        int[] arr={1,2,4,3,6,3,7,8,4,8,9};
        maopao.maoPao(arr);
    }
    public static  void maoPao(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i]<arr[j]){
                  int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }

        for (int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
