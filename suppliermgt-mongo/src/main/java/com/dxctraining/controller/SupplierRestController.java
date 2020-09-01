package com.dxctraining.controller;


import com.dxctraining.dto.CreateSupplier;
import com.dxctraining.dto.SupplierDto;
import com.dxctraining.entities.Supplier;
import com.dxctraining.services.ISupplierService;
import com.dxctraining.utility.SupplierUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/suppliers")
public class SupplierRestController {
    @Autowired
    private ISupplierService supplierService;


    @Autowired
    private SupplierUtility supplierUtility;

    @PostMapping(value = "/add")
    public SupplierDto create(@RequestBody CreateSupplier data)
    {
        String name=data.getName();
        String password=data.getPassword();
        Supplier supplier=new Supplier(name,password);
        supplier=supplierService.addSupplier(supplier);
        SupplierDto res=supplierDto(supplier);
        return res;
    }
    public SupplierDto supplierDto(Supplier supplier) {
        SupplierDto dto=new SupplierDto(supplier.getId(),supplier.getName(),
                supplier.getPassword());
        return dto;
    }
    @GetMapping("get/{id}")
    public SupplierDto supplierDto(@PathVariable("id") String id)
    {
        Supplier supplier=supplierService.findById(id);
        SupplierDto res=supplierDto(supplier);
        return res;
    }
}
