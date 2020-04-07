package ngonngulaptrinh.thuchanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print("Nhap nam: ");
        int yearCheck=n.nextInt();
        if (yearCheck%100==0){
            if (yearCheck%400==0){
                System.out.println("Nam Nhuan");
            }
            else {
                System.out.println("Khong Phai La Nam Nhuan");
            }
        }
        else {
            if (yearCheck%4==0){
                System.out.println("Nam Nhuan");
            }
            else {
                System.out.println("Khong phai nam nhuan");
            }
        }
    }
}
