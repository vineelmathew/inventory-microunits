package com.dxctraining.supplier.controller;


import com.dxctraining.supplier.dto.CreateSupplier;
import com.dxctraining.supplier.dto.PhoneDto;
import com.dxctraining.supplier.dto.SessionMaintain;
import com.dxctraining.supplier.dto.SupplierDto;
import com.dxctraining.supplier.entities.Supplier;
import com.dxctraining.supplier.services.ISupplierService;
import com.dxctraining.supplier.utility.SupplierUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class SupplierRestController {
    @Autowired
    private ISupplierService supplierService;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private SupplierUtility supplierUtility;

    @PostMapping(value = "/add")
    public SupplierDto create(@RequestBody CreateSupplier data)
    {
        String name=data.getName();
        String password=data.getPassword();
        Integer phoid= data.getPhoneid();
        Supplier supplier=new Supplier(name,password,phoid);
        supplier=supplierService.addSupplier(supplier);
        PhoneDto phoneDto=fetchPhoneId(phoid);
        SupplierDto res=supplierUtility.supplierDto(supplier,phoid,name);
        return res;
    }
    public SupplierDto supplierDto(Supplier supplier) {
        SupplierDto dto=new SupplierDto(supplier.getId(),supplier.getName(),supplier.getPassword(),supplier.getPhoneid());
        return dto;
    }
    private PhoneDto fetchPhoneId(Integer phoid) {
        String url = "http://localhost:8888/phones/get/" + phoid;
        PhoneDto dto = restTemplate.getForObject(url, PhoneDto.class);
        return dto;
    }
}
