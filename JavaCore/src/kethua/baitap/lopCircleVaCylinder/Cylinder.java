package kethua.baitap.lopCircleVaCylinder;

public class Cylinder extends Circle {
    private double height=1.0;
    public Cylinder(){

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getV(){
        return getArea()*getHeight();
    }
    @Override
    public String toString(){
        return "Hinh tru co chieu cao height="+getHeight()+", va dien tich day Area="+getArea()+" nen co the tich V="+getV();
    }
}
