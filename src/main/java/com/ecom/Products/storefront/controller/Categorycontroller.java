package com.ecom.Products.storefront.controller;

import com.ecom.Products.storefront.model.Category;
import com.ecom.Products.storefront.repository.Categoryrepository;
import com.ecom.Products.storefront.service.CategoryService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/categories")
@CrossOrigin(origins="http://localhost:5180/")
public class Categorycontroller {



    private final CategoryService categoryService;

    public Categorycontroller(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAllCategories(){
       return categoryService.getAllCategories();

    }
}
