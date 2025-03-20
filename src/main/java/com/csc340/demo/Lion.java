package com.csc340.demo;
import jakarta.persistence.*;

@Entity
@Table(name = "lions")
public class Lion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lionId;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String country;

    public Lion(int lionId, String name, String description, int age, String country) {
        this.lionId = lionId;
        this.name = name;
        this.description = description;
        this.age = age;
        this.country = country;
    }

    public Lion(String name, String description, int age, String country) {
        this.name = name;
        this.description = description;
        this.age = age;
        this.country = country;
    }

    //no-argument constructor
    public Lion(){
    }

    public int getLionId() {
        return lionId;
    }

    public void setLionId(int lionId) {

        this.lionId = lionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getCountry() {
        return country; }

    public void setCountry(String country) {
        this.country = country; }






}
