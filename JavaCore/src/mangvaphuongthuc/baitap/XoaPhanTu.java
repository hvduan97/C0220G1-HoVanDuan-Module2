package mangvaphuongthuc.baitap;

public class XoaPhanTu {
    public static void main(String[] args) {
        int[] arr={1,4,6,1,4,0,3,4,8,9,4,3,4,5,7,2,4};
        int[] newArr = null;
        int valueDel=4;
        int index=0;
        int dem=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==valueDel){
                index=i;
                for (int j=index;j<arr.length-1;j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]==valueDel){
                dem++;
            }
        }
        newArr=new int[arr.length-dem];
        for (int i=0;i<newArr.length;i++){
            newArr[i]=arr[i];
        }
        showArray(newArr);
    }
    public static void showArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
