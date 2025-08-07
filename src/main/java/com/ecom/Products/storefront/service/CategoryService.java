package com.ecom.Products.storefront.service;

import com.ecom.Products.storefront.model.Category;
import com.ecom.Products.storefront.repository.Categoryrepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    public CategoryService(Categoryrepository categoryrepository) {
        this.categoryrepository = categoryrepository;
    }

    private Categoryrepository categoryrepository;

    public List<Category> getAllCategories() {

        return categoryrepository.findAll();
    }
}
