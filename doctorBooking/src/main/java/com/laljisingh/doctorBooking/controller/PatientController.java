package com.laljisingh.doctorBooking.controller;

import com.laljisingh.doctorBooking.dto.DoctorDto;
import com.laljisingh.doctorBooking.dto.PatientDto;
import com.laljisingh.doctorBooking.model.Patients;
import com.laljisingh.doctorBooking.repository.Doctor;
import com.laljisingh.doctorBooking.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PatientController {
    @Autowired
    Doctor doctor;
    @Autowired
    PatientService patientService;
    @PostMapping("/add-patient")
    public ResponseEntity<String> addPatien(@Valid @RequestBody PatientDto newPatien){
        Patients doct = setPatien(newPatien);
        patientService.addPatient(doct);
        return new ResponseEntity<String>(newPatien.toString(), HttpStatus.OK);
    }
    @GetMapping("/getall-patient")
    public ResponseEntity<List<Patients>> getAllPatient(){
        List<Patients> allPatient = patientService.getAllPatient();
        return new ResponseEntity<>(allPatient, HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete-patient{id}")
    public ResponseEntity<String> deletePatient(@PathVariable Integer id){
        String deletepatien = patientService.deletepatien(id);
        return new ResponseEntity<>(deletepatien, HttpStatus.ACCEPTED);
    }

    private Patients setPatien(PatientDto newPatien) {
        Patients ptn=new Patients();
        ptn.setName(newPatien.getName());
        ptn.setEmail(newPatien.getEmail());
        ptn.setCity(newPatien.getCity());
        ptn.setPhone(newPatien.getPhone());
        ptn.setSymptom(newPatien.getSymptom());

        com.laljisingh.doctorBooking.model.Doctor doctor1 = doctor.findById(newPatien.getDoctorId()).get();
        ptn.setDoctorId(doctor1);
        return ptn;
    }
}
