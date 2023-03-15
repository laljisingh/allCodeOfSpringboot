package com.laljisingh.laptopPrice.repository;

import com.laljisingh.laptopPrice.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Laptoprepository extends JpaRepository<Laptop, Integer> {
}
