package mangvaphuongthuc.thuchanh;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int[] mang={3,2,4,9,3,8,4,9,1,0,2,9,7,4,7,3};
        System.out.println("Max la: "+maxArray(mang));
        System.out.println("Max dau tien nam o vi tri: "+maxFirstArray(mang));
        System.out.println("Max cuoi cung nam o vi tri: "+maxLastArray(mang));
    }
//    Tim gia tri lon nhat trong mang
    public static int maxArray(int[] mang){
        int max=mang[0];
        for (int i=1;i<mang.length;i++){
            if (max<mang[i]){
                max=mang[i];
            }
        }
        return max;
    }
//    Tim gia tri lon nhat dau tien
    public static int maxFirstArray(int[] mang){
        int max=mang[0];
        int index = 0;
        for (int i=1;i<mang.length;i++){
            if (max<mang[i]){
                max=mang[i];
                for (int j=0;j<mang.length;j++){
                    if (mang[j]==max){
                        index=j;
                        break;
                    }
                }
            }
        }
        return index;
    }
//    Tim gia tri lon nhat cuoi cung
    public static int maxLastArray(int[] mang){
        int max=mang[0];
        int index=0;
        for (int i=1;i<mang.length;i++){
            if (max<mang[i]){
                max=mang[i];
                for (int j=mang.length-1;j>=0;j--){
                    if (mang[j]==max){
                        index=j;
                        break;
                    }
                }
            }
        }
        return index;
    }
//    Tim gia tri lon nhat thu x;
//    public static int maxPositionArray(int[] mang){
//            int max=mang[0];
//            int index = 0;
//            int dem=0;
//            for (int i=1;i<mang.length;i++){
//                if (max<mang[i]){
//                    max=mang[i];
//                    for (int j=0;j<mang.length;j++){
//                        if (mang[j]==max){
//                            dem++;
//                        }
//                    }
//                }
//            }
//            return index;
//    }
}
