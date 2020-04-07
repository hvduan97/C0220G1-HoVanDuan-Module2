package ngonngulaptrinh.baitap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Nhap 1 de chuyen tu VND sang USD");
        System.out.println("Nhap 2 de chuyen tu USD sang VND");
        System.out.print("Bay gio hay nhap so: ");
        int num=n.nextInt();
        System.out.print("Nhap so tien muon chuyen: ");
        int tien=n.nextInt();
        switch (num){
            case 1:{
                System.out.println(tien+" VND tuong ung voi: "+tien/23000+" Dolar");
            }
            break;
            case 2:{
                System.out.println(tien+" Dolar tuong ung voi: "+tien*23000+" VND");
            }
        }
    }
}
