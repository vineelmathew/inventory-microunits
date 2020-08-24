package com.dxctraining.supplier.dao;

import com.dxctraining.supplier.entities.Supplier;

import java.util.List;

public interface ISupplierDao {
public Supplier addSupplier(Supplier supplier);
public void removeSupplier(int id);
public List<Supplier> supplierList();
public Supplier findById(int id);

}
