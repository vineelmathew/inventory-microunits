package com.dxctraining.phone.dto;

public class PhoneDto {
    private int id;
    private String name;
    private int size;

    public PhoneDto(int id, String name, int size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }
    public PhoneDto()
    {

    }

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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }







}