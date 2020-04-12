package mangvaphuongthuc.baitap;
import java.util.Arrays;
public class ChenPhanTuTrongMang {
    public static void main(String[] args) {
        int[] arr={2,5,9,1,2,8,4,6,3,9,2,0};
        int[] newArr=new int[arr.length+1];
        insertArray(99,3,arr,newArr);
        show(newArr);
    }
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void insertArray(int insertValue,int indexValue,int[] arr,int[] newArr){
        for (int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        for (int i=newArr.length-1;i>=indexValue;i--) newArr[i] = newArr[i - 1];
        newArr[indexValue]=insertValue;
    }
}
