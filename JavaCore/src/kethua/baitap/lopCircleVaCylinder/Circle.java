package kethua.baitap.lopCircleVaCylinder;

public class Circle {
    private final double PI=3.14;
    private double radius=1.0;
    private String color="white";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return getRadius()*getRadius()*PI;
    }
    @Override
    public String toString(){
        return "Hinh trong co ban kinh radius="+getRadius()+", mau color="+getColor();
    }
}
