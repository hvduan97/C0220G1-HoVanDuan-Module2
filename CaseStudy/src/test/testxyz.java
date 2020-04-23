package test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testxyz {
    public static void main(String[] args) {
       inputDescriptionAmenities();
    }
    public static String inputDescriptionAmenities() {
        Scanner scanner=new Scanner(System.in);
        boolean flag = true;
        String descriptionAmenities;
        do {
            System.out.print("Nhap vao tien nghi: ");
            descriptionAmenities = scanner.nextLine();
            String regex="massage|karaoke|food|drink|car";
            boolean matcher=Pattern.matches(regex,descriptionAmenities);
            if (matcher) {
                flag = false;
            } else {
                System.out.println("Format True: Nhap massage, karaoke, food, drink, car. Vui long nhap lai.");
            }
        } while (flag);
        return descriptionAmenities;
    }
}
