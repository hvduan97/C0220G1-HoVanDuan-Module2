package mangvaphuongthuc.baitap;

public class GopMang {
    public static void main(String[] args) {
        int[] mang1={1,2,3,4,5,6,7,8};
        int[] mang2={9,10,11,12,13,14,15,16,17};
        int[] mang3=new int[mang1.length+mang2.length];
        for (int i=0;i<mang1.length;i++){
            mang3[i]=mang1[i];
        }
        int k=0;
        for (int i=mang1.length;i<mang3.length;i++){
            mang3[i]=mang2[k];
            k++;
        }
        for (int i=0;i<mang3.length;i++){
            System.out.print(mang3[i]+" ");
        }
    }
}
