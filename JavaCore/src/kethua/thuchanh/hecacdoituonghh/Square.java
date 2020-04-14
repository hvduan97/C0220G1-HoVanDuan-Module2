package kethua.thuchanh.hecacdoituonghh;

import AdvancedObjectOrientedDesign.baitap.interfaceColorable.Colorable;
import AdvancedObjectOrientedDesign.baitap.interfaceResizeable.Resizeable;
import kethua.thuchanh.hecacdoituonghh.Rectangle;

public class Square extends Rectangle implements Resizeable, Colorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public double getArea(){
        return getSide()*getSide();
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        System.out.println("Dien tich hinh vuong luc nay la: "+(getArea()+getArea()*percent));
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
