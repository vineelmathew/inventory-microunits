package com.dxctraining.supplier.dao;

import com.dxctraining.supplier.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISupplierDao extends JpaRepository<Supplier,Integer> {

}
