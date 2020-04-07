package ngonngulaptrinh.thuchanh;

import java.util.Scanner;

public class PhuongtrinhBac1 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap a: ");
        a=sc.nextInt();
        System.out.print("Nhap b: ");
        b=sc.nextInt();
        giaiPT(a,b);
    }
    public static void giaiPT(int a,int b){
        if (!(a == 0)) {
            System.out.println("Phương trình có nghiệm là: "+ (-b/(float)a));
        } else {
            if (b==0){
                System.out.println("Phương trình vô số nghiệm");
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
