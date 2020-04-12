package mangvaphuongthuc.thuchanh;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] arr={9,3,5,1,10,3,5,1,8,6};
        System.out.println("Min là: "+minArray(arr));
    }
    public static int minArray(int[] arr){
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
