package com.dxctraining.supplier.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Supplier {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String password;
    private Integer phoneid;

    public Supplier(String name, String password, Integer phoneid) {
        this.name = name;
        this.password = password;
        this.phoneid = phoneid;
    }

    public Supplier() {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return id == supplier.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
