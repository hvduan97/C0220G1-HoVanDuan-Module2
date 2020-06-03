package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;
@Entity
@Table(name = "Customer")
public class Customer {
    private Long id;
    private String nameCustomer;
    private Date birthdayCustomer;
    private String idCard;
    private String phone;
    private String email;
    private String address;
    @ManyToOne
    @JoinColumn(name = "typeCustomer_id")
    private TypeCustomer typeCustomer;

    public Customer() {
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, nameCustomer='%s', birthdayCustomer='%tF', idCard='%s', phone='%s', email='%s, address='%s']", id, nameCustomer, birthdayCustomer, idCard, phone,email,address);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public Date getBirthdayCustomer() {
        return birthdayCustomer;
    }

    public void setBirthdayCustomer(Date birthdayCustomer) {
        this.birthdayCustomer = birthdayCustomer;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public TypeCustomer getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(TypeCustomer typeCustomer) {
        this.typeCustomer = typeCustomer;
    }
}
