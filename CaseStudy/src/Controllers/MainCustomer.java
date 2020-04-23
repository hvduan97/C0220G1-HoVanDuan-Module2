package Controllers;

import Models.Villa;

public class MainCustomer {
    public static void main(String[] args) {
        Villa villa=new Villa();
        Customer customer=new Customer("HoVanDuan","21/11/1997","Nam","192052509","0899209927","hvduan97@gmail.com","VIP","Hue");
        customer.showInfor();
    }
}
