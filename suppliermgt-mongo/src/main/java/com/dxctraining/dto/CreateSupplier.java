package com.dxctraining.dto;


public class CreateSupplier {
    private String name;
    private String password;
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

}
