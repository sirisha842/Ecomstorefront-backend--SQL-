package com.ecom.Products.storefront.repository;

import com.ecom.Products.storefront.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
 public  interface Categoryrepository extends JpaRepository<Category, Long> {
}
