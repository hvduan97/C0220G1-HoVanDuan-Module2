package mangvaphuongthuc.baitap;

import java.util.Scanner;

public class TimMin {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Scanner abc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            System.out.print("Phan tu thu "+(i+1)+" la: ");
            arr[i]=abc.nextInt();
        }
        int min=arr[0];
        int index=0;
        for (int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
                index=i;
            }
        }
        System.out.println("Phan tu nho nhat trong mang là: "+min);
    }
}
