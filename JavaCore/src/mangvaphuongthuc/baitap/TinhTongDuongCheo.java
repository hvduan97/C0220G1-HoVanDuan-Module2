package mangvaphuongthuc.baitap;

import java.util.Scanner;

public class TinhTongDuongCheo {
    public static void main(String[] args) {
        int[][] mang=new int[3][3];
        Scanner abc=new Scanner(System.in);
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("Nhap mang["+i+"]["+j+"]= ");
                mang[i][j]=abc.nextInt();
            }
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(mang[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (i==j){
                    sum+=mang[i][j];
                }
            }
        }
        System.out.println("Tong la: "+sum);
    }
}
