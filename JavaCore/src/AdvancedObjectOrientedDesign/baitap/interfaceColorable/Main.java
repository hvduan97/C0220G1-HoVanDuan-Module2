package AdvancedObjectOrientedDesign.baitap.interfaceColorable;

import kethua.thuchanh.hecacdoituonghh.Circle;
import kethua.thuchanh.hecacdoituonghh.Rectangle;
import kethua.thuchanh.hecacdoituonghh.Shape;
import kethua.thuchanh.hecacdoituonghh.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.4, "red", true);
        shapes[1] = new Rectangle(2.5, 5.4, "blue", true);
        shapes[2] = new Square(4.0, "black", true);
//        Shape square=new Square();
//        System.out.println(square instanceof Square);
//        System.out.println(shapes[2] instanceof Square);

        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            } else if (shape instanceof Circle) {
                System.out.println(((Circle) shape).getArea());
            } else if (shape instanceof Rectangle) {
                System.out.println(((Rectangle) shape).getArea());
            }
        }
    }
}
