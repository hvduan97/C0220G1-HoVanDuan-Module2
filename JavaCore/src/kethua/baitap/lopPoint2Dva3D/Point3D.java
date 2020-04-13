package kethua.baitap.lopPoint2Dva3D;

public class Point3D extends Point2D {
    private float z=0.0f;
    public Point3D(){

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{this.getX(),this.getY(),this.getZ()};
    }
    public String toString(){
        return "A Point 3D with cord x,y,z: ("+getX()+","+getY()+","+getZ()+") and cord xyz: ("+getXYZ()[0]+","+getXYZ()[1]+","+getXYZ()[2]+")";
    }

}
