package com.Learning.SpringThings.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Learning.SpringThings.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
	
}
