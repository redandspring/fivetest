package ru.redandspring.fivetest.service;

import ru.redandspring.fivetest.model.Product;

import java.util.List;


public interface ProductService {

    List<Product> findAll();

    Product findByName(String name);
}
