package ru.redandspring.fivetest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.redandspring.fivetest.model.Product;
import ru.redandspring.fivetest.service.ProductService;

import java.util.List;

@RestController
public class RetailController {

    private final ProductService productService;

    @Autowired
    public RetailController(final ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/products")
    public List<Product> getProducts() {
        return productService.findAll();
    }

    @GetMapping(value = "/products/{name}")
    public Product getProductByName(@PathVariable("name") final String name) {
        return productService.findByName(name);
    }
}
