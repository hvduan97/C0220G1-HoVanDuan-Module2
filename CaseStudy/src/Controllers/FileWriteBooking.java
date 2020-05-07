package Controllers;

import Models.House;
import Models.Room;
import Models.Villa;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteBooking {
    private static final String DAU_PHAY = ",";
    private static final String DONG_MOI = "\n";
    FileWriter fileBooking = null;

    public void writeCsvBookingVillaFile(Customer customer, Villa services) throws IOException {
        fileBooking = new FileWriter("D:\\CodegymMD2\\CaseStudy\\src\\Data\\Booking.csv",true);
        fileBooking.append(customer.getNameCustomer());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getBirthDay());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getGender());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getIdCard());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getPhone());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getEmail());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getTypeCustomer());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getAddress());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(services.getId());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(services.getNameService());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(String.valueOf(services.getAreaUsed()));
        fileBooking.append(DAU_PHAY);
        fileBooking.append(String.valueOf(services.getRentalFee()));
        fileBooking.append(DAU_PHAY);
        fileBooking.append(Integer.toString((int) services.getMaxPeople()));
        fileBooking.append(DAU_PHAY);
        fileBooking.append(String.valueOf(services.getTypeRent()));
        fileBooking.append(DAU_PHAY);
        fileBooking.append(services.getStandardRoom());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(String.valueOf(services.getPoolArea()));
        fileBooking.append(DAU_PHAY);
        fileBooking.append(String.valueOf(services.getNumberFloor()));
        fileBooking.append(DONG_MOI);
        fileBooking.flush();
    }

    public void writeCsvBookingHouseFile(Customer customer, House services) throws IOException {
        fileBooking = new FileWriter("D:\\CodegymMD2\\CaseStudy\\src\\Data\\Booking.csv",true);
        fileBooking.append(customer.getNameCustomer());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getBirthDay());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getGender());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getIdCard());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getPhone());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getEmail());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getTypeCustomer());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getAddress());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(services.getId());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(services.getNameService());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(String.valueOf(services.getAreaUsed()));
        fileBooking.append(DAU_PHAY);
        fileBooking.append(String.valueOf(services.getRentalFee()));
        fileBooking.append(DAU_PHAY);
        fileBooking.append(Integer.toString((int) services.getMaxPeople()));
        fileBooking.append(DAU_PHAY);
        fileBooking.append(String.valueOf(services.getTypeRent()));
        fileBooking.append(DAU_PHAY);
        fileBooking.append(services.getStandardRoom());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(String.valueOf(services.getNumberFloor()));
        fileBooking.append(DONG_MOI);
        fileBooking.flush();
    }

    public void writeCsvBookingRoomFile(Customer customer, Room services) throws IOException {
        fileBooking = new FileWriter("D:\\CodegymMD2\\CaseStudy\\src\\Data\\Booking.csv",true);
        fileBooking.append(customer.getNameCustomer());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getBirthDay());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getGender());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getIdCard());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getPhone());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getEmail());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getTypeCustomer());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(customer.getAddress());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(services.getId());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(services.getNameService());
        fileBooking.append(DAU_PHAY);
        fileBooking.append(String.valueOf(services.getAreaUsed()));
        fileBooking.append(DAU_PHAY);
        fileBooking.append(String.valueOf(services.getRentalFee()));
        fileBooking.append(DAU_PHAY);
        fileBooking.append(Integer.toString((int) services.getMaxPeople()));
        fileBooking.append(DAU_PHAY);
        fileBooking.append(String.valueOf(services.getTypeRent()));
        fileBooking.append(DONG_MOI);
        fileBooking.flush();
    }

    public void ext(){
        try {
            fileBooking.close();
        } catch (Exception e) {
            System.out.println();
        }

    }
}
