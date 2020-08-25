package com.dxctraining.supplier.dto;

public class SupplierDto {
    private int id;
    private String name;
    private String password;
    private Integer phoneid;
    private String productName;

    public SupplierDto(int id, String name, String password,Integer phoneid) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phoneid=phoneid;
    }
    public SupplierDto()
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(Integer phoneid) {
        this.phoneid = phoneid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
