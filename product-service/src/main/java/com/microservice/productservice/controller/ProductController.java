package com.microservice.productservice.controller;

import com.microservice.productservice.entity.Product;
import com.microservice.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @Created 19/09/2022 - 13:57
 * @Package com.microservice.productservice.controller
 * @Project product-service
 * @User LegendDZ
 * @Author Abdelaaziz Ouakala
 **/
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProductList() {
        List<Product> productList = productRepository.findAll();
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveProduct(@RequestBody Product product) {
        productRepository.save(product);
    }

}
