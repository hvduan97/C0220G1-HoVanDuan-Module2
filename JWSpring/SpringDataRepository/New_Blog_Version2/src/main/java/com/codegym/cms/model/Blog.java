package com.codegym.cms.model;



import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "blogs")
public class Blog {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private Date day;
    private String content;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Blog() {}

    public Blog(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public Blog(Long id, String name, Date day, String content, Category category) {
        this.id = id;
        this.name = name;
        this.day = day;
        this.content = content;
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("Blog[id=%d, name='%s', content='%s', day='%tF']", id, name, content, day);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}