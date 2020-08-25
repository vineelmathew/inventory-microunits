package com.dxctraining.phone.controller;

import com.dxctraining.phone.dto.Createphone;
import com.dxctraining.phone.dto.PhoneDto;
import com.dxctraining.phone.dto.SupplierDto;
import com.dxctraining.phone.entities.Phone;
import com.dxctraining.phone.services.IPhoneService;
import com.dxctraining.phone.utility.PhoneUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/phones")
public class PhoneRestController {
    @Autowired
    private IPhoneService iPhoneService;
    @Autowired
    private RestTemplate restTemplate;


    @PostMapping(value = "/add")
    public PhoneDto create(@RequestBody Createphone data) {
        String name = data.getName();
        int size = data.getSize();
        int supplierId=data.getSupplierid();
        double price = data.getPrice();
        Phone phone = new Phone(name, size, supplierId, price);
        phone = iPhoneService.addPhone(phone);
        SupplierDto supplierDto = getSupplierId(supplierId);
        PhoneDto phoneres = PhoneUtility.phoneDto(phone, supplierId, supplierDto.getName());
        return phoneres;
    }

    public SupplierDto getSupplierId(int supid) {
        String url = "http://localhost:8989/suppliers/get/" + supid;
        SupplierDto dto = restTemplate.getForObject(url, SupplierDto.class);
        return dto;
    }


}
