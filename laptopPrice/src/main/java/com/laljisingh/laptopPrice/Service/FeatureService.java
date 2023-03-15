package com.laljisingh.laptopPrice.Service;

import com.laljisingh.laptopPrice.model.Feature;
import com.laljisingh.laptopPrice.repository.Featurerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeatureService {
    @Autowired
    Featurerepository featurerepository;
    public void addFeatures(Feature newFeature) {
        featurerepository.save(newFeature);
    }

    public List<Feature> getAllFeatures() {
        List<Feature> all = featurerepository.findAll();
        return all;
    }

    public void deleteFeatures(Integer id) {
        featurerepository.deleteById(id);
    }

    public Feature updateFeature(Feature newFeature, Integer id) {
        Feature oldfeature = featurerepository.findById(id).get();
        oldfeature.setOs(newFeature.getOs());
        oldfeature.setProcessor(newFeature.getProcessor());
        Feature save = featurerepository.save(oldfeature);
        return save;
    }
}
