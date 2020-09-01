package com.dxctraining.supplier.services;

import com.dxctraining.exceptions.InvalidArgumentException;
import com.dxctraining.exceptions.SupplierException;
import com.dxctraining.supplier.dao.ISupplierDao;
import com.dxctraining.supplier.entities.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class SupplierServiceImple implements ISupplierService {
    @Autowired
    private ISupplierDao supplierDao;

    private void validate(Supplier supplier) {
        if(supplier==null)
        {
            throw new InvalidArgumentException("supplier cant be null");
        }
    }

    @Override
    public Supplier save(Supplier supplier) {
  validate(supplier);
      supplierDao.save(supplier);
      return supplier;
    }

    @Override
    public void removeSupplier(int id) {
     validateId(id);
     supplierDao.deleteById(id);
    }

    private void validateId(int id) {
        if(id<0)
        {
            throw new InvalidArgumentException("id cant be negative");

        }
    }

    @Override
    public List<Supplier> supplierList() {
        List<Supplier>list=supplierDao.findAll();
        return list;
    }

    @Override
    public Supplier findById(int id) {
       Optional<Supplier> optional=supplierDao.findById(id);
      if(!optional.isPresent())
      {
            throw new SupplierException("supplier not found="+id);
      }
      Supplier supplier= optional.get();
       return supplier;
    }
}
