package ngonngulaptrinh.thuchanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print("Enter number: ");
        int numberCheck=n.nextInt();
        isPrime(numberCheck);
    }
    static void isPrime(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("is Prime");
        }
        else {
            System.out.println("not is Prime");
        }
    }
}
