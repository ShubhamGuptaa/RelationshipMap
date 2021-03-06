package com.relationship.spring.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @Column
    private String classes;
    @Column
    private String subject;
    public Teacher(int id, String name, String classes, String subject) {
        this.id = id;
        this.name = name;
        this.classes = classes;
        this.subject = subject;
    }
    public Teacher() {

    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClasses() {
        return classes;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
  
}
