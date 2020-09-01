package com.dxctraining.services;

import com.dxctraining.entities.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;


//@Service
public class SupplierServiceImple implements ISupplierService {
    @Autowired
    private MongoTemplate mongo;

    @Override
    public Supplier addSupplier(Supplier supplier) {
        mongo.save(supplier);
        return supplier;
    }

    @Override
    public void removeSupplier(String id) {
        Supplier supplier = findById(id);
        mongo.remove(id);
    }

    @Override
    public List<Supplier> supplierList() {
        List<Supplier> suppliers = mongo.findAll(Supplier.class);
        return suppliers;
    }

    @Override
    public Supplier findById(String id) {
        Supplier supplier = mongo.findById(id, Supplier.class);
        return supplier;
    }

    @Override
    public List<Supplier> findByName(String name) {
        Criteria criteria = Criteria.where("name").is(name);
        Query query = Query.query(criteria);
        List<Supplier> suppliers = mongo.find(query, Supplier.class);
        return suppliers;
    }
}