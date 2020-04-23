package Models;

import java.io.Serializable;

public class Villa extends Services {
    private String standardRoom="Chuan";
    private String descriptionAmenities="TV";
    private double poolArea=30;
    private int numberFloor=2;

    public Villa() {
    }

    public Villa(String standardRoom, String descriptionAmenities, double poolArea, int numberFloor) {
        this.standardRoom = standardRoom;
        this.descriptionAmenities = descriptionAmenities;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public Villa(String nameService, double areaUsed, double rentalFee, int maxPeople, String typeRent, String id, String standardRoom, String descriptionAmenities, double poolArea, int numberFloor) {
        super(nameService, areaUsed, rentalFee, maxPeople, typeRent, id);
        this.standardRoom = standardRoom;
        this.descriptionAmenities = descriptionAmenities;
        this.poolArea = poolArea;
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

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
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
        +"Dien tich ho boi: "+getPoolArea()+"\n"
        +"So tang: "+getNumberFloor()+"\n"
        +"ID: "+getId());
    }
}
