package com.dxctraining.service;


import com.dxctraining.entities.Supplier;
import com.dxctraining.services.ISupplierService;
import com.dxctraining.services.SupplierRepositoryImplementation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.core.MongoTemplate;

@DataMongoTest
@Import(SupplierRepositoryImplementation.class)
public class SupplierServiceImpleTest {

    @Autowired
    private ISupplierService supplierService;

    @Autowired
    private MongoTemplate mongoTemplate;

@Test
public void Test1()
{
String name="vineel";
Supplier supplier=new Supplier("mathew","1111");
supplierService.addSupplier(supplier);
String getName=supplier.getName();
Assertions.assertEquals(name,getName);
}

}
