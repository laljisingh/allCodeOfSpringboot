package com.laljisingh.laptopPrice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer laptop_id;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    private Feature feature_id;
    private Integer price;

}
