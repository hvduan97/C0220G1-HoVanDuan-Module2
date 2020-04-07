package ngonngulaptrinh.baitap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=n.nextInt();
        while (num<100 || num>999){
            num=n.nextInt();
        }
            int lastNumber=num%10;
            switch (lastNumber){
                case 0:{
                    System.out.print("zero");
                }
                break;
                case 1:{
                    System.out.print("one");
                }
                break;
                case 2:{
                    System.out.print("two");
                }
                break;
                case 3:{
                    System.out.print("three");
                }
                break;
                case 4:{
                    System.out.print("four");
                }
                break;
                case 5:{
                    System.out.print("five");
                }
                break;
                case 6:{
                    System.out.print("six");
                }
                break;
                case 7:{
                    System.out.print("seven");
                }
                break;
                case 8:{
                    System.out.print("eight");
                }
                break;
                case 9:{
                    System.out.print("nine");
                }
                break;
            }
            int midNumber=((num-(num%10))%100)/10;
            switch (midNumber){
                case 0:{
                    System.out.print("zero");
                }
                break;
                case 1:{
                    System.out.print("ten");
                }
                break;
                case 2:{
                    System.out.print("twenty");
                }
                break;
                case 3:{
                    System.out.print("thirty");
                }
                break;
                case 4:{
                    System.out.print("fourty");
                }
                break;
                case 5:{
                    System.out.print("fifty");
                }
                break;
                case 6:{
                    System.out.print("sixty");
                }
                break;
                case 7:{
                    System.out.print("seventy");
                }
                break;
                case 8:{
                    System.out.print("eighty");
                }
                break;
                case 9:{
                    System.out.print("ninety");
                }
                break;
            }
            int firstNumber=num/100;
            switch (firstNumber){
                case 1:{
                    System.out.print("one");
                }
                break;
                case 2:{
                    System.out.print("two");
                }
                break;
                case 3:{
                    System.out.print("three");
                }
                break;
                case 4:{
                    System.out.print("four");
                }
                break;
                case 5:{
                    System.out.print("five");
                }
                break;
                case 6:{
                    System.out.print("six");
                }
                break;
                case 7:{
                    System.out.print("seven");
                }
                break;
                case 8:{
                    System.out.print("eight");
                }
                break;
                case 9:{
                    System.out.print("nine");
                }
                break;
            }
        System.out.println(firstNumber+" hundred"+midNumber+" and"+lastNumber);

    }
}
