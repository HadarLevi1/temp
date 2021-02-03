package com.dev;

import com.dev.Objects.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Repository {
    private List<Product> myProducts = new ArrayList<>();

    @PostConstruct
    public void constructor () {
        myProducts.add(new Product("Shirt", 200, true));
        myProducts.add(new Product("Chair", 500, true));
    }


    public List<Product> getProducts () {
        return myProducts;
    }

    public void addProduct (String description, int price, boolean existing) {
        Product productToAdd = new Product(description, price, existing);
        myProducts.add(productToAdd);
    }
}
