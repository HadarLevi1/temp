package com.dev.Controllers;

import com.dev.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DashboardController {

    @Autowired
    private Repository repository;


    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public Object products() {
        return repository.getProducts();
    }

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public Object product(int id, String name) {
        return repository.getProducts().get(id);
    }

    @RequestMapping(value = "/add-product", method = RequestMethod.POST)
    public void addProduct (String description, int price, boolean existing) {
        repository.addProduct(description, price, existing);
    }








}
