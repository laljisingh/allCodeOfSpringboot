package com.laljisingh.doctorBooking.service;

import com.laljisingh.doctorBooking.model.Patients;
import com.laljisingh.doctorBooking.repository.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    Patient patient;
    public void addPatient(Patients doct) {
        patient.save(doct);
    }

    public List<Patients> getAllPatient() {
        List<Patients> all = patient.findAll();
        return all;
    }

    public String deletepatien(Integer id) {
        patient.deleteById(id);
        return "deleted";
    }
}
