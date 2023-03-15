package com.laljisingh.laptopPrice.controller;

import com.laljisingh.laptopPrice.Service.FeatureService;
import com.laljisingh.laptopPrice.model.Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FeatureController {
    @Autowired
    FeatureService featureService;
    @PostMapping("/add-feature")
    public ResponseEntity<String> addFeature(@RequestBody Feature newFeature){
        featureService.addFeatures(newFeature);
        return new ResponseEntity<>("Feature Saved", HttpStatus.ACCEPTED);
    }
    @GetMapping("/get-features")
    public ResponseEntity<List<Feature>> getFeature(){
        List<Feature> allFeatures = featureService.getAllFeatures();
        return new ResponseEntity<>(allFeatures, HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete-feature/{id}")
    public ResponseEntity<String> deleteFeatures(@PathVariable Integer id){
        featureService.deleteFeatures(id);
        return new ResponseEntity<>("Feature Delete", HttpStatus.ACCEPTED);
    }
    @PutMapping("/update-featues/{id}")
    public ResponseEntity<Feature> updateFeatures(@RequestBody Feature newFeature,@PathVariable Integer id){
        Feature feature = featureService.updateFeature(newFeature, id);
        return new ResponseEntity<>(feature, HttpStatus.CREATED);
    }
}
