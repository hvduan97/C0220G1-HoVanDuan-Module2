package ngonngulaptrinh.thuchanh;

import java.util.Scanner;

public class TimViTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner n=new Scanner(System.in);
        System.out.print("Nhap: ");
        String nhap=n.nextLine();
        int index = 0;
        boolean a = false;
        for (int i=0;i<students.length;i++){
            if (students[i].equals(nhap)){
                index=i;
                a=true;
            }
        }
        if (a){
            System.out.println(index);
        }
        else {
            System.out.println("K tim thay");
        }

    }
}
