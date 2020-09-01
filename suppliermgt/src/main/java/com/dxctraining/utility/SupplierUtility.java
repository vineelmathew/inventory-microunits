package com.dxctraining.utility;

import com.dxctraining.dto.SupplierDto;
import com.dxctraining.entities.Supplier;
import org.springframework.stereotype.Component;

@Component
public class SupplierUtility {

    public SupplierDto supplierDto(Supplier supplier, int phoneid, String name)
    {
        SupplierDto supplierDto=new SupplierDto(supplier.getId(),
                supplier.getName(),supplier.getPassword());
        return supplierDto;
    }

}
