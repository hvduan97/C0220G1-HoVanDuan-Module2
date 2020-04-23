package Models;

public abstract class Services {
    private String nameService="Villa";
    private double areaUsed=30.0;
    private double rentalFee=10.0;
    private int maxPeople=10;
    private String typeRent="Vip";
    private String id="123456789";

    public Services() {
    }

    public Services(String nameService, double areaUsed, double rentalFee, int maxPeople, String typeRent, String id) {
        this.nameService = nameService;
        this.areaUsed = areaUsed;
        this.rentalFee = rentalFee;
        this.maxPeople = maxPeople;
        this.typeRent = typeRent;
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void showInfor();
}
