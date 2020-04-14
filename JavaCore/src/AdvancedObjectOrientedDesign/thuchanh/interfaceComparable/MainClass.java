package AdvancedObjectOrientedDesign.thuchanh.interfaceComparable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        SonOfCircle[] son=new SonOfCircle[4];
        son[0]=new SonOfCircle(3.5,"red",true);
        son[1]=new SonOfCircle(3.0,"red",true);
        son[2]=new SonOfCircle(2.5,"red",true);
        son[3]=new SonOfCircle(1.5,"red",true);
        for (int i=0;i<son.length;i++){
            System.out.println(son[i].getRadius());
        }
        Arrays.sort(son);
        System.out.println("Sau khi sap xep:");
        for (int i=0;i<son.length;i++){
            System.out.println(son[i].getRadius());
        }
    }
}
