package com.njain51.demo.springbootmongosample.model;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 6/18/2022, Saturday
 **/

import org.springframework.data.mongodb.core.mapping.Document;

/**
 What this program snippet doing?
 **/
@Document(collection = "students")
public class Student {

    private int id;
    private String name;
    private String city;
    private String college;

    //create constructor

    public Student(int id, String name, String city, String college) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.college = college;
    }


    // create getter setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    // create toString() method


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
