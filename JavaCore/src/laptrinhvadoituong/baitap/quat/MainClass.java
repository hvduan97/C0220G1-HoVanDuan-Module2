package laptrinhvadoituong.baitap.quat;

public class MainClass {
    public static void main(String[] args) {
        Fan fan1=new Fan();
        Fan fan2=new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan1.setOn(true);
        fan2.setOn(false);
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
