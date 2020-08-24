package com.dxctraining.phone.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Phone {
    @Id
    @GeneratedValue
    private int id;
    private int StorageSize;
    private String name;
    public Phone(  String name,int storageSize) {
        StorageSize = storageSize;
        this.name = name;
    }
    public Phone() {
    }

    public int getStorageSize() {
        return StorageSize;
    }

    public void setStorageSize(int storageSize) {
        StorageSize = storageSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
