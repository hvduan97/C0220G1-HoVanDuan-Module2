package laptrinhvadoituong.baitap.ptBac2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.print("nhap a: ");
        double a=abc.nextDouble();
        System.out.print("nhap b: ");
        double b=abc.nextDouble();
        System.out.print("nhap c: ");
        double c=abc.nextDouble();
        QuadraticEquation pt=new QuadraticEquation(a,b,c);
        double delta=pt.getDiscriminant();
        if (delta>0){
            System.out.println("Phuong trinh co 2 nghiem la: "+pt.getRoot1()+" va "+pt.getRoot2());
        }
        else if (delta==0){
            System.out.println("Phuong trinh co 1 nghiem la: "+pt.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
