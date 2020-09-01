package com.dxctraining.dao;
import com.dxctraining.entities.Supplier;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ISupplierDao extends MongoRepository<Supplier,String> {


}
