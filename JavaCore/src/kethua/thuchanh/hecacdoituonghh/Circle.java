package kethua.thuchanh.hecacdoituonghh;

public class Circle extends Shape{
    private final double PI=3.14;
    private double radius=1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return getRadius()*getRadius()*PI;
    }
    public double getPerimete(){
        return getRadius()*2*PI;
    }
    @Override
    public String toString(){
        return "A Circle with radius= "+getRadius()+", which is a subclass of "+super.toString();
    }

}
