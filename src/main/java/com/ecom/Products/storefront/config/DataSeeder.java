package com.ecom.Products.storefront.config;


import com.ecom.Products.storefront.model.Category;
import com.ecom.Products.storefront.model.Product;
import com.ecom.Products.storefront.repository.Categoryrepository;
import com.ecom.Products.storefront.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {



    private final ProductRepository productRepository;
    private final Categoryrepository categoryrepository;

    public DataSeeder(ProductRepository productRepository, Categoryrepository categoryrepository) {
        this.productRepository = productRepository;
        this.categoryrepository = categoryrepository;
    }

    @Override
    public void run(String... args) throws Exception {



        productRepository.deleteAll();;
        categoryrepository.deleteAll();

        //category creation

        Category  Apparel= new Category();
        Apparel.setName("Clothes");

        Category  Books= new Category();
        Books.setName("Books");

        Category  Foods= new Category();
        Foods.setName("Foods");

        Category  Accessory= new Category();
        Accessory.setName("Fashion items");

        Category  Supplies= new Category();
        Supplies.setName("Home Supplies");
        categoryrepository.saveAll(Arrays.asList(Apparel,Books,Foods,Accessory,Supplies));


        //product creation

        Product jeans =new Product();
        jeans.setName("Pants");
        jeans.setDescription("A blue colored high waisted essential jeans good for dailywear");
        jeans.setImageurl("https://placehold.co/400");
        jeans.setPrice(2000.00);
        jeans.setCategory(Apparel);

        Product Leggins =new Product();
        Leggins.setName("Pants");
        Leggins.setDescription("A black colored high waisted essential jeans good for dailywear");
        Leggins.setImageurl("https://placehold.co/400");
        Leggins.setPrice(400.00);
        Leggins.setCategory(Apparel);


        Product cartoonbook =new Product();
        cartoonbook.setName("Cartoon color filling book");
        cartoonbook.setDescription("Book of 50 cartoons that can be filled with colors");
        cartoonbook.setImageurl("https://placehold.co/400");
        cartoonbook.setPrice(250.00);
        cartoonbook.setCategory(Books);

        Product javabook =new Product();
        javabook.setName("Fifth standard edition book");
        javabook.setDescription("A programming standard edition book");
        javabook.setImageurl("https://placehold.co/400");
        javabook.setPrice(2488.99);
        javabook.setCategory(Books);

        Product gummies =new Product();
        gummies.setName("Strawberry gummies");
        gummies.setDescription("Chewy fruity treats");
        gummies.setImageurl("https://placehold.co/400");
        gummies.setPrice(50.00);
        gummies.setCategory(Foods);

        Product watch =new Product();
        watch.setName("Tata watch");
        watch.setDescription("Platinum colored steel dialed watch");
        watch.setImageurl("https://placehold.co/400");
        watch.setPrice(850.02);
        watch.setCategory(Accessory);

        productRepository.saveAll(Arrays.asList(jeans,Leggins,cartoonbook,javabook,gummies,watch));



    }
}
