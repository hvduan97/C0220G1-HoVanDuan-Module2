package com.codegym.cms.model;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Blog {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String content;

    public Blog() {}

    public Blog(String firstName, String lastName) {
        this.name = firstName;
        this.content = lastName;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, name, content);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstName) {
        this.name = firstName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String lastName) {
        this.content = lastName;
    }
}