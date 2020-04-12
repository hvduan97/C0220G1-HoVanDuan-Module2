package mangvaphuongthuc.thuchanh;

import java.util.Scanner;

public class DemSinhVien {
    public static void main(String[] args) {
        double[] student=new double[10];
        int dem=0;
        Scanner abc=new Scanner(System.in);
        for (int i=0;i<student.length;i++){
            System.out.print("Diem cua sinh vien thu "+(i+1)+" la: ");
            student[i]=abc.nextDouble();
        }
        for (int i=0;i<student.length;i++){
            if (student[i]>=5){
                System.out.println("Sinh vien thu "+(i+1)+" thi do");
                dem++;
            }
        }
        System.out.println("Co tat ca: "+dem+" sinh vien thi do");
    }
}
