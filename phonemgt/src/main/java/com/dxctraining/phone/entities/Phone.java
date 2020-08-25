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
    private int supplierId;
    private double price;
    public Phone(String name,int storageSize,int supplierId,double price) {
        this.StorageSize = storageSize;
        this.name = name;
        this.supplierId=supplierId;
        this.price=price;

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
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
