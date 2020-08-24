package com.dxctraining.phone.dto;

public class Createphone {
    private String name;
    private int size;
    public Createphone(String name, int size) {
        this.name = name;
        this.size = size;
    }
    public Createphone()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
