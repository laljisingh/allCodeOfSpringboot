package com.laljisingh.mapping.service;


import com.laljisingh.mapping.model.Hostel;
import com.laljisingh.mapping.repository.HostelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HostelService {
    @Autowired
    HostelRepository hostelRepository;
    public void addHostel(Hostel hostel) {
        hostelRepository.save(hostel);
    }
}
