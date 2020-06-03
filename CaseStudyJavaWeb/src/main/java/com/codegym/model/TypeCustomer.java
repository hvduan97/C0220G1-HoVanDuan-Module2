package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TypeCustomer")
public class TypeCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameTypeCustomer;
    @OneToMany(targetEntity = Customer.class)
    private List<Customer> customers;

    public TypeCustomer() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameTypeCustomer() {
        return nameTypeCustomer;
    }

    public void setNameTypeCustomer(String nameTypeCustomer) {
        this.nameTypeCustomer = nameTypeCustomer;
    }
}
