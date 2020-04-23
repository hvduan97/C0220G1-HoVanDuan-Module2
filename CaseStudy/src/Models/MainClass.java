package Models;

public class MainClass {
    public static void main(String[] args) {
        Villa villa=new Villa("Villa",10.0,10.0,10,"VIP","1234567890",
                "Chuan","them TV",10.0,10);
//        villa.showInfor();
        House house=new House("House",10.0,10.0,10,"VIP","1234567890",
                "Chuan","them TV",10);
//        house.showInfor();
        Room room=new Room("Room",10.0,10.0,10,"VIP","1234567890",
                "Dung dieu hoa");
        room.showInfor();
    }
}
