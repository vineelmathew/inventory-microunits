package com.dxctraining;

import com.dxctraining.dto.CreateSupplier;
import com.dxctraining.entities.Supplier;
import com.dxctraining.services.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class UI {
    @Autowired
    private ISupplierService supplierService;
    @PostConstruct
    public void start() {
    Supplier supplier1=new Supplier("vineel","1344");
        Supplier supplier2=new Supplier("rudrapati","1333");
        Supplier supplier3=new Supplier("dave","1223");
        supplierService.addSupplier(supplier1);
        supplierService.addSupplier(supplier2);
        supplierService.addSupplier(supplier3);
         displayAll();
         String findName=supplier1.getName();
         displaybyName(findName);
    }

    public void displaybyName(String findName) {
        System.out.println("DISPLAYING BY NAME");
          List<Supplier>suppliers=supplierService.findByName(findName);
          for(Supplier supplier:suppliers)
          {
           display(supplier);
          }
    }

    private void display(Supplier supplier) {
        System.out.println("Name="+supplier.getName()+"  Password="+supplier.getPassword()+
                "  ID="+supplier.getId());

    }

    public void displayAll() {
        System.out.println("*********displaying all********");
        List<Supplier>supplierList=supplierService.supplierList();
      for(Supplier supplier:supplierList)
      {
          display(supplier);
      }
    }
}
