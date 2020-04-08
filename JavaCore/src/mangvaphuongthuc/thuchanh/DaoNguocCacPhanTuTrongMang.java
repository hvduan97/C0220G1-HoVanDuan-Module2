package mangvaphuongthuc.thuchanh;

public class DaoNguocCacPhanTuTrongMang {
    public static void main(String[] args) {
        int[] mang={1,4,2,7,2,9,1,8,3,0,2,3,5};
        System.out.println("Mang ban dau: ");
        System.out.println(mang);
        System.out.println("Mang sau khi dao nguoc: ");
        daoMang(mang);
    }
    public static void daoMang(int[] mang){
        int first=0;
        int last=mang.length-1;
        while (first<last){
            int tem=mang[first];
            mang[first]=mang[last];
            mang[last]=tem;
            first++;
            last--;
        }
        System.out.println(mang);
    }
}
