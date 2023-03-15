package com.laljisingh.laptopPrice.controller;

import com.laljisingh.laptopPrice.Service.LaptopService;
import com.laljisingh.laptopPrice.model.Feature;
import com.laljisingh.laptopPrice.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;
    @PostMapping("/add-post")
    public ResponseEntity<String> addLaptop(@RequestBody Laptop newLaptop){
        laptopService.addLaptop(newLaptop);
        return new ResponseEntity<>("Added Succefull", HttpStatus.ACCEPTED);
    }
    @GetMapping("/get-laptop")
    public ResponseEntity<String> getLaptop(){
        List<Laptop> allFeatures = laptopService.getAllLaptop();
        return new ResponseEntity<>(allFeatures.toString(), HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete-laptop/{id}")
    public ResponseEntity<String> deleteLaptop(@PathVariable Integer id){
        laptopService.deleteLaptop(id);
        return new ResponseEntity<>("Laptop Delete", HttpStatus.ACCEPTED);
    }
    @PutMapping("/update-laptop/{id}")
    public ResponseEntity<Laptop> updatelaptop(@RequestBody Laptop newFeature,@PathVariable Integer id){
        Laptop feature = laptopService.updateLaptop(newFeature, id);
        return new ResponseEntity<>(feature, HttpStatus.CREATED);
    }
}
