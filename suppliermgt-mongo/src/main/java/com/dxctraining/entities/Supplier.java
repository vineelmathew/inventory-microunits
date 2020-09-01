package com.dxctraining.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Id;
import java.util.Objects;

@Document("suppliers")
public class Supplier {
    @Id
    private String id;
    private String name;
    private String password;

    public Supplier(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Supplier() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return Objects.equals(id, supplier.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
