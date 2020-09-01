package com.dxctraining.supplier.services;



import com.dxctraining.supplier.entities.Supplier;

import java.util.List;

public interface ISupplierService {
     Supplier save(Supplier supplier);
     void removeSupplier(int id);
     List<Supplier> supplierList();
     Supplier findById(int id);
}
