package com.model;

import org.springframework.stereotype.Component;

@Component
public class Students {

    private  int id;

    private String name;

    private double mark;

    public  Students(){
        super();
    }

    public Students(int id, double mark, String name) {
        this.id = id;
        this.mark = mark;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }

    public void  display(){
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("marks="+mark);
    }
}
