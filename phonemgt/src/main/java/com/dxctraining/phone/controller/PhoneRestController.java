package com.dxctraining.phone.controller;

import com.dxctraining.phone.dto.Createphone;
import com.dxctraining.phone.dto.PhoneDto;
import com.dxctraining.phone.entities.Phone;
import com.dxctraining.phone.services.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/phones")
public class PhoneRestController {
    @Autowired
    private IPhoneService iPhoneService;
    @PostMapping(value="/addphone")
public PhoneDto create(@RequestBody Createphone data)
    {
String name= data.getName();
int size=data.getSize();
Phone phone=new Phone(name,size);
phone=iPhoneService.addPhone(phone);
PhoneDto phoneres=phoneDto(phone);
return  phoneres;
    }

   public PhoneDto phoneDto(Phone phone) {
PhoneDto datacon=new PhoneDto(phone.getId(),phone.getName(),phone.getStorageSize());
return  datacon;
    }
}
