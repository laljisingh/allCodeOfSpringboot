package com.laljisingh.doctorBooking.repository;

import com.laljisingh.doctorBooking.model.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Patient extends JpaRepository<Patients, Integer> {
}
