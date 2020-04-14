package AdvancedObjectOrientedDesign.thuchanh.interfaceComparable;

import kethua.thuchanh.hecacdoituonghh.Circle;

public class SonOfCircle extends Circle implements Comparable<SonOfCircle> {
    public SonOfCircle() {
    }

    public SonOfCircle(double radius) {
        super(radius);
    }

    public SonOfCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(SonOfCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
