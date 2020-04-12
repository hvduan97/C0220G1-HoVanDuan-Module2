package mangvaphuongthuc.baitap;

import java.util.Scanner;

public class IllegalTriangleException00 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner abc=new Scanner(System.in);
        a=3;
        b=4;
        c=-5;
        try {
            tamGiac(a,b,c);
        }catch (IllegalTriangleException e){
            System.out.println("Bạn đã nhập sai");
        }

    }
    public static void tamGiac(int a,int b,int c) throws IllegalTriangleException {
        if (a<0 || b<0 || c<0 || a+b<=c || a+c<=b || c+b<=a){
            throw new IllegalTriangleException("abc");
        }
    }
}
