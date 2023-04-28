package com.laljisingh.doctorBooking.controller;

import com.laljisingh.doctorBooking.dto.DoctorDto;
import com.laljisingh.doctorBooking.model.Doctor;
import com.laljisingh.doctorBooking.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class DoctorController {
    @Autowired
    DoctorService doctorService;
    @GetMapping("/all-doctor")
    public ResponseEntity<String> getAllDotor(){
        return new ResponseEntity<String>("okkk", HttpStatus.OK);
    }

    @PostMapping("/add-doctor")
    public ResponseEntity<String> addDocotr(@Valid @RequestBody DoctorDto newDoctor){
        Doctor doct = setDoctor(newDoctor);
        doctorService.addDoctor(doct);
        return new ResponseEntity<String>(newDoctor.toString(), HttpStatus.OK);
    }

    @DeleteMapping("/delete-doctor{id}")
    public ResponseEntity<String> deleteDoctor(@PathVariable Integer id){
        String deletepatien = doctorService.deletedoctor(id);
        return new ResponseEntity<>(deletepatien, HttpStatus.ACCEPTED);
    }

    private Doctor setDoctor(DoctorDto newDoctor) {
        Doctor doct=new Doctor();
        doct.setName(newDoctor.getName());
        doct.setCity(newDoctor.getCity());
        doct.setEmail(newDoctor.getEmail());
        doct.setSpeciality(newDoctor.getSpeciality());
        doct.setPhoneNumber(newDoctor.getPhoneNumber());
        return doct;
    }
}
