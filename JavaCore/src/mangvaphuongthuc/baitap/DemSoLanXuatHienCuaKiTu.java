package mangvaphuongthuc.baitap;

public class DemSoLanXuatHienCuaKiTu {
    public static void main(String[] args) {
        String str="Xin chao, toi la Ho Van Duan";
        char duan='i';
        int dem=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==duan){
                dem++;
            }
        }
        System.out.println(duan+" xuat hien "+dem+" lan");
    }
}
