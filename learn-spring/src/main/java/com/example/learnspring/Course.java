package com.example.learnspring;

import java.io.Serializable;

public record Course(long id, String name, String description, int price) implements Serializable {
    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
    }
}
/*
* public class Course implements Serializable {

    private final long id;
    private final String name;
    private final String description;
    private final int price;
    //constructor
    public Course(long id,String name,String description,int price){
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
    }
    //getter and setter

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    //toString
    @Override
    public String toString(){
        return "Course [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
    }
}

* */