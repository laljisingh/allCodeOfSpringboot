package com.laljisingh.doctorBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Doctor extends JpaRepository<com.laljisingh.doctorBooking.model.Doctor, Integer>{
}
