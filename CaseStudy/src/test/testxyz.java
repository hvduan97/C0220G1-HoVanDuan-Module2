package test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testxyz {
    public static void main(String[] args) {
        System.out.println(inputPhone());
    }
    public static String inputPhone() {
        Scanner scanner=new Scanner(System.in);
        boolean flag = true;
        String phone;
        do {
            System.out.print("Nhap so dien thoai: ");
            phone = scanner.nextLine();
            String regex="^[0]{1}[0-9]{9}$";
            boolean matcher=Pattern.matches(regex,phone);
            if (matcher) {
                flag = false;
            } else {
                System.out.println("SDT phai co 10 so. Vui long nhap lai.");
            }
        } while (flag);
        return phone;
    }
}
