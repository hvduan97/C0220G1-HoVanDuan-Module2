package ngonngulaptrinh.thuchanh;

import java.util.Scanner;

public class TinhLaiNganHang {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print("So luong tien cho vay: ");
        int tien=n.nextInt();
        System.out.print("Ty le lai suat: ");
        int laiSuat=n.nextInt();
        System.out.print("So thang gui ngan hang: ");
        int soThang=n.nextInt();
        double tienLai= ((tien * laiSuat) / 12) * soThang;
        System.out.println(tienLai);
    }
}
