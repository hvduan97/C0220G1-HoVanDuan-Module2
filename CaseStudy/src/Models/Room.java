package Models;

public class Room extends Services{
    private String freeService="Su dung dieu hoa";

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String nameService, double areaUsed, double rentalFee, int maxPeople, String typeRent, String id, String freeService) {
        super(nameService, areaUsed, rentalFee, maxPeople, typeRent, id);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public void showInfor() {
        System.out.println("Ten dich vu: "+getNameService()+"\n"
                +"Dien tich su dung: "+getAreaUsed()+"\n"
                +"Chi phi thue: "+getRentalFee()+"\n"
                +"So nguoi toi da: "+getMaxPeople()+"\n"
                +"Kieu thue: "+getTypeRent()+"\n"
               +"Dich vu mien phi "+getFreeService());
    }
}
