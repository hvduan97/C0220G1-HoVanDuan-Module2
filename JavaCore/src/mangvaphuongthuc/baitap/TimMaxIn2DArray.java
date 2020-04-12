package mangvaphuongthuc.baitap;

import java.util.Scanner;

public class TimMaxIn2DArray {
    public static void main(String[] args) {
        int[][] mang=new int[3][5];
        Scanner abc=new Scanner(System.in);
        for (int i=0;i<3;i++){
            for (int j=0;j<5;j++){
                System.out.print("Nhap mang["+i+"]["+j+"]= ");
                mang[i][j]=abc.nextInt();
            }
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<5;j++){
                System.out.print(mang[i][j]+" ");
            }
            System.out.println();
        }
        int max=mang[0][0];
        for (int i=0;i<3;i++){
            for (int j=0;j<5;j++){
                if (mang[i][j]>max){
                    max=mang[i][j];
                }
            }
        }
        System.out.println("Max la: "+max);
    }
}
