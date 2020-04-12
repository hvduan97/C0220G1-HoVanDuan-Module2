package mangvaphuongthuc.baitap;

import java.util.Scanner;

public class TinhTongOCot {
    public static void main(String[] args) {
        Float[][] mang=new Float[3][5];
        Scanner abc=new Scanner(System.in);
        for (int i=0;i<3;i++){
            for (int j=0;j<5;j++){
                System.out.print("Nhap mang["+i+"]["+j+"]= ");
                mang[i][j]=abc.nextFloat();
            }
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<5;j++){
                System.out.print(mang[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Nhập cột muốn tính: ");
        int cot=abc.nextInt();
        while (cot<0 && cot>2){
            System.out.print("Nhập cột muốn tính: ");
            cot=abc.nextInt();
        }
        double sum=0;
        for (int i=0;i<3;i++){
            for (int j=0;j<5;j++){
                if (i==cot){
                    sum+=mang[i][j];
                }
            }
        }
        System.out.println("Tong la: "+sum);
    }
}
