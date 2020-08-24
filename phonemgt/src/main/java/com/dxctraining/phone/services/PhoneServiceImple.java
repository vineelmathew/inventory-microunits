package com.dxctraining.phone.services;

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
        Phone phone=phoneDao.findById(id);
        return phone;
    }
}
