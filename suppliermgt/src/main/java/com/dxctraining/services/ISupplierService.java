package com.dxctraining.services;


import com.dxctraining.entities.Supplier;

import java.util.List;

public interface ISupplierService {
     Supplier addSupplier(Supplier supplier);
     void removeSupplier(String id);
     List<Supplier> supplierList();
     Supplier findById(String id);
     List<Supplier> findByName(String name);

}
