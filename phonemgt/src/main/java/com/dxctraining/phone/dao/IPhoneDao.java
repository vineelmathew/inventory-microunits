package com.dxctraining.phone.dao;
import com.dxctraining.phone.entities.Phone;
import java.util.List;

public interface IPhoneDao {
    Phone addPhone(Phone phone);
    void removePhone(int id);
    List<Phone> phonelist();
    Phone findById(int id);
}
