package ngonngulaptrinh.thuchanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print("Enter Month: ");
        int month=n.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:{
                System.out.println("Có 31 ngày");
            }
            break;
            case 2:{
                System.out.println("Có 28 ngày, nếu nhuận có 29 ngày");
            }
            break;
            case 4:
            case 6:
            case 9:
            case 11:{
                System.out.println("Có 30 ngày");
            }
            break;
            default:{
                System.out.println("Không phai la thang");
            }
        }
    }
}
