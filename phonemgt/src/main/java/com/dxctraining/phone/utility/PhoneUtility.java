package com.dxctraining.phone.utility;

import com.dxctraining.phone.dto.PhoneDto;
import com.dxctraining.phone.entities.Phone;

public class PhoneUtility {
    public static PhoneDto phoneDto(Phone phone, int supid, String name) {
        PhoneDto phoneDto=new PhoneDto(phone.getId(),phone.getName(),phone.getStorageSize(),
                phone.getPrice());
        phoneDto.setSupplierId(supid);
        phoneDto.setSupplierName(name);
        return phoneDto;
    }
}
