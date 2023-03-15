package com.laljisingh.laptopPrice.repository;

import com.laljisingh.laptopPrice.model.Feature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Featurerepository extends JpaRepository<Feature, Integer> {
}
