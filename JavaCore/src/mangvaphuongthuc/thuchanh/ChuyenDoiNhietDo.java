package mangvaphuongthuc.thuchanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit ");
        System.out.print("Nhap nhiet do: ");
        double temper=abc.nextDouble();
        System.out.print("Nhap so tuong ung voi menu: ");
        int numChoose=abc.nextInt();
        switch (numChoose){
            case 1:{
                System.out.println(temper+" F tuong ung voi "+fahrenheitToCelsius(temper)+" C");
            }
            break;
            case 2:{
                System.out.println(temper+" C tuong ung voi "+celsiusToFahrenheit(temper)+" F");
            }
            break;
            case 0:{
                break;
            }
        }
        while (true){
            System.out.println("Menu:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            System.out.print("Nhap nhiet do: ");
            temper=abc.nextDouble();
            System.out.print("Nhap so tuong ung voi menu: ");
            numChoose=abc.nextInt();
            switch (numChoose){
                case 1:{
                    System.out.println(temper+" F tuong ung voi "+fahrenheitToCelsius(temper)+" C");
                }
                break;
                case 2:{
                    System.out.println(temper+" C tuong ung voi "+celsiusToFahrenheit(temper)+" F");
                }
                break;
                case 0:{
                    System.exit(0);
                }
            }
        }

    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit=(celsius*9)/5+32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
