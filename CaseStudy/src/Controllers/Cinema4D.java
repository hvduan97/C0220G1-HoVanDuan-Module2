package Controllers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cinema4D {
    public static void main(String[] args) {
        cinema();
    }
    public static void cinema() {
        Queue<String> names = new LinkedList<String>();
        Scanner scanner=new Scanner(System.in);
        int k=1;
        System.out.print("Nhap so ve hom nay: ");
        int ticket=scanner.nextInt();
        System.out.println("Danh sach khach hang--------------------");
        do {
            System.out.print("Ten khach hang: ");
            String customer = scanner.next();
            System.out.println("Ve thu "+k+" duoc khach hang "+customer+" mua");
            names.add(customer);
            k++;
        }while (k<=ticket);
        System.out.println("Het ve------------------------------------>");
        System.out.println("Danh sach khach hang da mua ve hom nay: ");
        while (true) {
            String name = names.poll();
            if (name == null) {
                break;
            }
            System.out.println(name);
        }
    }
}
