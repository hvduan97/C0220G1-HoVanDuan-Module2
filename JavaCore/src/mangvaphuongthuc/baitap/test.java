package mangvaphuongthuc.baitap;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] arr={1,4,6,1,0,3,4,8,9,3,4,5,7,2,4};
        int valueDel=4;
        int index=0;
        int dem=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==valueDel){
                index=i;
                dem+=1;
            }
        }
        System.out.println(arr.length+" và "+dem);
    }
}
