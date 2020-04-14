package AdvancedObjectOrientedDesign.baitap.interfaceResizeable;

import kethua.thuchanh.hecacdoituonghh.Circle;

import java.util.Random;

public class CircleMain {
    public static void main(String[] args) {
        Random generator = new Random();
        Circle[] circles=new Circle[4];
        circles[0]=new Circle(3.5,"red",false);
        circles[1]=new Circle(4.0,"black",true);
        circles[2]=new Circle(1.0,"pink",true);
        circles[3]=new Circle(2.5,"red",false);

        System.out.println("Truoc khi tăng kich thuoc");
        for (int i=0;i<circles.length;i++){
            System.out.println(circles[i].getArea());
        }
        System.out.println("Sau khi tang");
        for (int i=0;i<circles.length;i++){
            int value = generator.nextInt((100 - 1) + 1) + 1;
            circles[i].resize(value);
        }
    }
}
