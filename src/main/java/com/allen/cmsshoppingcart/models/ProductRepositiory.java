package com.allen.cmsshoppingcart.models;

import com.allen.cmsshoppingcart.models.data.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositiory extends JpaRepository<Product, Integer> {

}
