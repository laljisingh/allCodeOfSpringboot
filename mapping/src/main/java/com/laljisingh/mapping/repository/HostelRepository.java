package com.laljisingh.mapping.repository;


import com.laljisingh.mapping.model.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostelRepository extends JpaRepository<Hostel, Integer> {
}
