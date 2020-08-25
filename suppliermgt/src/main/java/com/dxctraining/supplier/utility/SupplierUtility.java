package com.dxctraining.supplier.utility;

import com.dxctraining.supplier.dto.SupplierDto;
import com.dxctraining.supplier.entities.Supplier;
import org.springframework.stereotype.Component;

@Component
public class SupplierUtility {

    public SupplierDto supplierDto(Supplier supplier,int phoneid,String name)
    {
        SupplierDto supplierDto=new SupplierDto(supplier.getId(),supplier.getName(),
                supplier.getPassword(),supplier.getPhoneid());
        supplierDto.setPhoneid(phoneid);
        supplierDto.setProductName(name);
        return supplierDto;
    }

}
