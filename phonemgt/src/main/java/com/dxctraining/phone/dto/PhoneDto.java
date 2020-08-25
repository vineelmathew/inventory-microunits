package com.dxctraining.phone.dto;

public class PhoneDto {
    private int id;
    private String name;
    private int size;
    private double price;
    private String supplierName;
    private int SupplierId;

    public PhoneDto(int id, String name, int size,double price) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.price=price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSupplierName() {
        return supplierName;
    }
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getSupplierId() {
        return SupplierId;
    }

    public void setSupplierId(int supplierId) {
        SupplierId = supplierId;
    }
}
