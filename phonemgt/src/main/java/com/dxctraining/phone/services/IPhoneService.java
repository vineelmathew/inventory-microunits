package com.dxctraining.phone.services;


import com.dxctraining.phone.entities.Phone;

import java.util.List;

public interface IPhoneService {
    Phone addPhone(Phone phone);
    void removePhone(int id);
    List<Phone> phonelist();
    Phone findById(int id);
    boolean authenticateId(int id);
    List<Phone> phonesByPrice(double price);
    List<Phone> phonesBySuppliers(int id);
}
