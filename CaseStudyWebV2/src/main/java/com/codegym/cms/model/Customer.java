package com.codegym.cms.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    @Pattern(regexp = "^(KH-[0-9]{4})$",message = "Có dạng KH-XXXX(X là số)")
    private String code;
    private String nameCustomer;
    @NotEmpty
//    @Pattern(regexp = "^(((0[1-9]|1[012])\\/(?!00|29)([012]\\d)|(0[13-9]|1[012])\\/(29|30)|(0[13578]|1[02])\\/31)\\/(18|19|20)\\d{2}|02\\/29\\/((18|19|20)(0[48]|[2468][048]|[13579][26])|2000))$")
//    @Pattern(regexp = "^(([1-9]|0[1-9]|1[0-9]|2[0-9]|3[0-1])\\/(0[1-9]|[1-9]|1[0-2])\\/[0-9]{4})$",message = "ngày sinh có dạng: DD/MM/YYYY")
    @Pattern(regexp = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)",message = "Định dạng: dd/mm/yy")
    private String birthdayCustomer;
    @Pattern(regexp = "^([0-9]{9})$",message = "CMND phải có 9 chữ số")
    private String idCard;
    @NotEmpty
    @Pattern(regexp = "^(090[0-9]{7}|091[0-9]{7}|\\(84\\)\\+90[0-9]{7}|\\(84\\)\\+91[0-9]{7})$",message = "SDT có dạng: 090xxxxxxx hoặc 091xxxxxxx hoặc (84)+90xxxxxxx hoặc (84)+91xxxxxxx")
    private String phone;
    @NotEmpty
    @Email
    private String email;
    private String address;
    @ManyToOne
    @JoinColumn(name = "typecustomer_id")
    private TypeCustomer typeCustomer;
    @OneToMany(targetEntity = Contract.class)
    private List<Contract> contracts;

    public Customer() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public TypeCustomer getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(TypeCustomer typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

//    @Override
//    public String toString() {
//        return String.format("Customer[id=%d, nameCustomer='%s', birthdayCustomer='%tF', idCard='%s', phone='%s', email='%s, address='%s']", id, nameCustomer, birthdayCustomer, idCard, phone,email,address);
//    }

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

    public String getBirthdayCustomer() {
        return birthdayCustomer;
    }

    public void setBirthdayCustomer(String birthdayCustomer) {
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
}
