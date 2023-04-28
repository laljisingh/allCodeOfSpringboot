package com.laljisingh.doctorBooking.service;

import com.laljisingh.doctorBooking.repository.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DoctorService {
    @Autowired
    Doctor doctor;
    @Autowired
    Doctor doctorModel;

    public void addDoctor(com.laljisingh.doctorBooking.model.Doctor newDoctor) {
        doctor.save(newDoctor);
    }

    public String deletedoctor(Integer id) {
        doctor.deleteById(id);
        return "docotor deleted";
    }
}
