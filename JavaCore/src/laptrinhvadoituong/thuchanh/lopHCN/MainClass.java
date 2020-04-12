package laptrinhvadoituong.thuchanh.lopHCN;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        LopHCN hcn=new LopHCN(width,height);
        System.out.println("Your Rectangle \n"+ hcn.display());
        System.out.println("Perimeter of the Rectangle: "+ hcn.getPerimeter());
        System.out.println("Area of the Rectangle: "+ hcn.getArea());
    }
}
