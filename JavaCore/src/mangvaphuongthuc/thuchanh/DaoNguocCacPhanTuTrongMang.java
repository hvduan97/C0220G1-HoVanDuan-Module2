package mangvaphuongthuc.thuchanh;

public class DaoNguocCacPhanTuTrongMang {
    public static void main(String[] args) {
        int[] mang={1,4,2,7,2,9,1,8,3,0,2,3,5};
        String a="";
        String b="";
        for (int i=0;i<mang.length;i++){
            a+=mang[i]+" ";
        }
        System.out.println("Mang ban dau: ");
        System.out.println(a);
        daoMang(mang);
        for (int i=0;i<mang.length;i++){
            b+=mang[i]+" ";
        }
        System.out.println("Mang sau khi dao:");
        System.out.println(b);
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
    }
}
