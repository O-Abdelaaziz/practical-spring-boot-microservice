package com.microservice.productservice.repository;

import com.microservice.productservice.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Created 19/09/2022 - 13:56
 * @Package com.microservice.productservice.repository
 * @Project product-service
 * @User LegendDZ
 * @Author Abdelaaziz Ouakala
 **/
@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
