package ngonngulaptrinh.thuchanh;

import java.util.Scanner;

public class TimUCLN {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print("nhap a: ");
        int a=n.nextInt();
        System.out.print("nhap b: ");
        int b=n.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0 && b==0){
            System.out.println("Không có UCLN");
        }
        while (a!=b){
            if (a>b){
                a=a-b;
            }
            else {
                b=b-a;
            }
        }
        System.out.println("UCLN: " + a);
    }
}
