package com.example.crud.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "PERSON_DETAILS")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer personID;
    private String name;
    @Column(unique = true)
    private String email;
    private LocalDate createdAt = LocalDate.now();

    @Override
    public String toString() {
        return "Person{" +
                "personID=" + personID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
