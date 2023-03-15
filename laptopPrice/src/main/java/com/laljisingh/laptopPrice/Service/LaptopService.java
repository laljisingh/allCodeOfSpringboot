package com.laljisingh.laptopPrice.Service;

import com.laljisingh.laptopPrice.model.Laptop;
import com.laljisingh.laptopPrice.repository.Featurerepository;
import com.laljisingh.laptopPrice.repository.Laptoprepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LaptopService {
    @Autowired
    Laptoprepository laptoprepository;
    @Autowired
    Featurerepository featurerepository;
    public void addLaptop(Laptop newLaptop) {
        laptoprepository.save(newLaptop);
    }

    public List<Laptop> getAllLaptop() {
       return laptoprepository.findAll();
    }

    public void deleteLaptop(Integer id) {
        laptoprepository.deleteById(id);
    }

    public Laptop updateLaptop(Laptop newLaptop, Integer id) {
        Laptop laptop = laptoprepository.findById(id).get();
        laptop.setName(newLaptop.getName());
        laptop.setPrice(newLaptop.getPrice());
        laptop.setFeature_id(newLaptop.getFeature_id());

        Laptop save = laptoprepository.save(laptop);
        return save;
    }
}
