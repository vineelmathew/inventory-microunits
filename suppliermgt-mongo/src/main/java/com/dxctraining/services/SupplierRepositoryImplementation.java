package com.dxctraining.services;

import com.dxctraining.dao.ISupplierDao;
import com.dxctraining.entities.Supplier;
import com.dxctraining.exceptions.SupplierException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierRepositoryImplementation implements ISupplierService {

    @Autowired
    private ISupplierDao supplierDao;

    @Override
    public Supplier addSupplier(Supplier supplier) {
   supplier=supplierDao.save(supplier);
   return supplier;
    }

    @Override
    public void removeSupplier(String id) {
        supplierDao.deleteById(id);
    }

    @Override
    public List<Supplier> supplierList() {
        List<Supplier>list=supplierDao.findAll();
        return list;
    }

    @Override
    public Supplier findById(String id) {
        Optional<Supplier> optional = supplierDao.findById(id);
        boolean exist = optional.isPresent();
        if (!exist) {
  throw  new SupplierException("suppliers not found="+id);
        }
        Supplier supplier = optional.get();
        return supplier;

    }

    @Override
    public List<Supplier> findByName(String name) {
        List<Supplier>list=supplierDao.findByName(name);
      return list;
    }
}
