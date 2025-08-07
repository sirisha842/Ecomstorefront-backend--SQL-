package com.ecom.Products.storefront.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Product{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String imageurl;
    private Double price;


    @ManyToOne
    @JsonBackReference
    private Category category ;

}
