package mangvaphuongthuc.thuchanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException00 {
    public static void main(String[] args) {
        Random rd=new Random();
        Scanner abc=new Scanner(System.in);
        int index = 0;
        int[] mang=new int[100];
        for (int i=0;i<mang.length;i++){
            mang[i]=rd.nextInt();
        }
        try {
            System.out.print("Moi nhap chi so: ");
            index=abc.nextInt();
            System.out.println("Gia tri trong mang la: "+mang[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Chi so vuot qua gioi han");
        }
    }
}
