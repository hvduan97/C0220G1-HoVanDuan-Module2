package kethua.thuchanh.hecacdoituonghh;

import kethua.thuchanh.hecacdoituonghh.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
