package com.dxctraining.supplier.dto;


public class CreateSupplier {
    private String name;
    private String password;
    private Integer phoneid;
    private Integer computerid;
    public CreateSupplier(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public CreateSupplier() {

    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(Integer phoneid) {
        this.phoneid = phoneid;
    }

    public Integer getComputerid() {
        return computerid;
    }

    public void setComputerid(Integer computerid) {
        this.computerid = computerid;
    }
}
