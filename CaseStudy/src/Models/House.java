package Models;

public class House extends Services{
    private String standardRoom="TB";
    private String descriptionAmenities="Them tu lanh";
    private int numberFloor=9;

    public House() {
    }

    public House(String standardRoom, String descriptionAmenities, int numberFloor) {
        this.standardRoom = standardRoom;
        this.descriptionAmenities = descriptionAmenities;
        this.numberFloor = numberFloor;
    }

    public House(String nameService, double areaUsed, double rentalFee, int maxPeople, String typeRent, String id, String standardRoom, String descriptionAmenities, int numberFloor) {
        super(nameService, areaUsed, rentalFee, maxPeople, typeRent, id);
        this.standardRoom = standardRoom;
        this.descriptionAmenities = descriptionAmenities;
        this.numberFloor = numberFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionAmenities() {
        return descriptionAmenities;
    }

    public void setDescriptionAmenities(String descriptionAmenities) {
        this.descriptionAmenities = descriptionAmenities;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public void showInfor() {
        System.out.println("Ten dich vu: "+getNameService()+"\n"
                +"Dien tich su dung: "+getAreaUsed()+"\n"
                +"Chi phi thue: "+getRentalFee()+"\n"
                +"So nguoi toi da: "+getMaxPeople()+"\n"
                +"Kieu thue: "+getTypeRent()+"\n"
                +"Tieu chuan phong: "+getStandardRoom()+"\n"
                +"Mo ta tien nghi khac: "+getDescriptionAmenities()+"\n"
                +"So tang: "+getNumberFloor());
    }
}
