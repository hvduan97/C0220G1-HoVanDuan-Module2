package Controllers;

import Models.Services;
import Models.Villa;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class Customer{
    private String nameCustomer;
    private String birthDay;
    private String gender;
    private String idCard;
    private String phone;
    private String email;
    private String typeCustomer;
    private String address;
    private Services services;

    public Customer() {
    }

    public Customer(String nameCustomer, String birthDay, String gender, String idCard, String phone, String email, String typeCustomer, String address) {
        this.nameCustomer = nameCustomer;
        this.birthDay = birthDay;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public String showInfor(){
        if (getServices() == null) {
            return "Ten khach hang: "+getNameCustomer()+"\n"
                    +"Ngay Sinh: "+getBirthDay()+"\n"
                    +"Gioi tinh: "+getGender()+"\n"
                    +"So CMND: "+getIdCard()+"\n"
                    +"Dien thoai: "+getPhone()+"\n"
                    +"Email: "+getEmail()+"\n"
                    +"Loai khach hang: "+getTypeCustomer()+"\n"
                    +"Dia chi: "+getAddress()+"\n";
        } else {
            return "Ten khach hang: "+getNameCustomer()+"\n"
                    +"Ngay Sinh: "+getBirthDay()+"\n"
                    +"Gioi tinh: "+getGender()+"\n"
                    +"So CMND: "+getIdCard()+"\n"
                    +"Dien thoai: "+getPhone()+"\n"
                    +"Email: "+getEmail()+"\n"
                    +"Loai khach hang: "+getTypeCustomer()+"\n"
                    +"Dia chi: "+getAddress()+"\n"
                    +"Su dung dich vu: "+this.getServices()+"\n";
        }
    }
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void addNewCustomer(List<Customer> customers){
            Scanner scanner=new Scanner(System.in);
            String nameCustomer=MainController.inputNameCustomer();
            String birthDay=MainController.inputBirthDay();
            String gender=MainController.inputGender();
            String idCard=MainController.inputIdCard();
            String phone=MainController.inputPhone();
            String email=MainController.inputEmail();
            String typeCustomer=MainController.inputTypeCustomer();
            System.out.print("Nhap dia chi:");
            String address=scanner.nextLine();

            Customer customer=new Customer(nameCustomer, birthDay, gender, idCard, phone, email, typeCustomer, address);
            customers.add(customer);

            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter("D:\\CodegymMD2\\CaseStudy\\src\\Data\\Customer.csv",true);
                for (Customer country : customers) {
                    fileWriter.append(nameCustomer);
                    fileWriter.append(COMMA_DELIMITER );
                    fileWriter.append(birthDay);
                    fileWriter.append(COMMA_DELIMITER );
                    fileWriter.append(gender);
                    fileWriter.append(COMMA_DELIMITER );
                    fileWriter.append(idCard);
                    fileWriter.append(COMMA_DELIMITER );
                    fileWriter.append(phone);
                    fileWriter.append(COMMA_DELIMITER );
                    fileWriter.append(email);
                    fileWriter.append(COMMA_DELIMITER );
                    fileWriter.append(typeCustomer);
                    fileWriter.append(COMMA_DELIMITER );
                    fileWriter.append(address);
                    fileWriter.append(COMMA_DELIMITER );
                    fileWriter.append(NEW_LINE_SEPARATOR);
                }

                System.out.println("CSV file was created successfully !!!");

            } catch (Exception e) {
                System.out.println("Error in CsvFileWriter !!!");
                e.printStackTrace();
            } finally {
                try {
                    fileWriter.flush();
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("Error while flushing/closing fileWriter !!!");
                    e.printStackTrace();
                }
            }
    }
}
