package AdvancedObjectOrientedDesign.baitap.interfaceResizeable;

import kethua.thuchanh.hecacdoituonghh.Circle;
import kethua.thuchanh.hecacdoituonghh.Rectangle;
import kethua.thuchanh.hecacdoituonghh.Shape;
import kethua.thuchanh.hecacdoituonghh.Square;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random generator = new Random();
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.4, "red", true);
        shapes[1] = new Rectangle(2.5, 5.4, "blue", true);
        shapes[2] = new Square(4.0, "black", true);
        System.out.println("Truoc khi tăng kich thuoc");
        for (int i=0;i<shapes.length;i++){
            if (shapes[i] instanceof Square) {
                System.out.print("Dien tich hinh vuong: ");
                System.out.println(((Square) shapes[i]).getArea());
            } else if (shapes[i] instanceof Circle) {
                System.out.print("Dien tich hinh tron: ");
                System.out.println(((Circle) shapes[i]).getArea());
            } else if (shapes[i] instanceof Rectangle) {
                System.out.print("Dien tich hinh chu nhat:");
                System.out.println(((Rectangle) shapes[i]).getArea());
            }
        }
        System.out.println("Sau khi tang kich thuoc: ");
        for (int i=0;i<shapes.length;i++){
            int value = generator.nextInt((100 - 1) + 1) + 1;
            if (shapes[i] instanceof Square) {
                ((Square) shapes[i]).resize(value);
            } else if (shapes[i] instanceof Circle) {
                ((Circle) shapes[i]).resize(value);
            } else if (shapes[i] instanceof Rectangle) {
                ((Rectangle) shapes[i]).resize(value);
            }
        }
    }
}
