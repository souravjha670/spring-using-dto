package com.Learning.SpringThings.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Learning.SpringThings.Service.ProductService;
import com.Learning.SpringThings.dto.ProductDto;

@RestController
@RequestMapping("/map")
public class ProductController {
	
	@Autowired
    private ProductService productService;
	
	@PostMapping("/postmalone")
	public ResponseEntity<ProductDto> saveProducts (@RequestBody ProductDto productDto) {
		ProductDto saveProducts = productService.saveProducts(productDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveProducts);
	}

}
