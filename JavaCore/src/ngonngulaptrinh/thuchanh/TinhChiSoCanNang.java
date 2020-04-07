package ngonngulaptrinh.thuchanh;

import java.util.Scanner;

public class TinhChiSoCanNang {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print("Nhap chieu cao tinh bang meter(m): ");
        float height=n.nextFloat();
        System.out.print("Nhap can nang tinh bang kilogram(kg): ");
        float weight=n.nextFloat();
        float bmi=weight/(height*height);
        if (bmi>=30){
            System.out.println("Obese");
        }
        else if (bmi>=25){
            System.out.println("Overweight");
        }
        else if (bmi>=15.8){
            System.out.println("Normal");
        }
        else {
            System.out.println("Underweight");
        }
    }
}
