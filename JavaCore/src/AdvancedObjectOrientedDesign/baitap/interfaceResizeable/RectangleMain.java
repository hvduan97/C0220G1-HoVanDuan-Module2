package AdvancedObjectOrientedDesign.baitap.interfaceResizeable;

import kethua.thuchanh.hecacdoituonghh.Rectangle;

import java.util.Random;

public class RectangleMain {
    public static void main(String[] args) {
        Random generator = new Random();
        Rectangle[] rectangles=new Rectangle[4];
        rectangles[0]=new Rectangle(3,4,"red",false);
        rectangles[1]=new Rectangle(3.5,3.2,"red",false);
        rectangles[2]=new Rectangle(5,4,"red",false);
        rectangles[3]=new Rectangle(2,3,"red",false);

        System.out.println("Truoc khi tăng kich thuoc");
        for (int i=0;i<rectangles.length;i++){
            System.out.println(rectangles[i].getArea());
        }
        System.out.println("Sau khi tang");
        for (int i=0;i<rectangles.length;i++){
            int value = generator.nextInt((100 - 1) + 1) + 1;
            rectangles[i].resize(value);
        }
    }
}
