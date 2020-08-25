package com.dxctraining.phone.services;

import com.dxctraining.exceptions.InvalidArgumentException;
import com.dxctraining.phone.entities.Phone;
import com.dxctraining.phone.dao.IPhoneDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PhoneServiceImple implements IPhoneService {

    @Autowired
    private IPhoneDao phoneDao;

    @Override
    public Phone addPhone(Phone phone) {
        phoneDao.addPhone(phone);
        return phone;
    }

    @Override
    public void removePhone(int id) {
     phoneDao.removePhone(id);
    }

    @Override
    public List<Phone> phonelist() {
        List<Phone>result=phoneDao.phonelist();
        return  result;
    }

    @Override
    public Phone findById(int id) {
        validateId(id);
        Phone phone=phoneDao.findById(id);
        return phone;
    }

    @Override
    public boolean authenticateId(int id) {
     Phone phone=phoneDao.findById(id);
     if(phone!=null)
     {
         return true;
     }
     else
         return false;
    }

    private void validateId(int id) {
        if(id<0)
        {
            throw new InvalidArgumentException("id cant be negative");
        }
    }
    @Override
    public List<Phone> phonesByPrice(double price) {
        List<Phone>phoneprice=phoneDao.phoneByPrice(price);
        return phoneprice;
    }

    @Override
    public List<Phone> phonesBySuppliers(int id) {
        List<Phone>phonesuppliers=phoneDao.phonebySuppliers(id);
        return phonesuppliers;
    }
}
