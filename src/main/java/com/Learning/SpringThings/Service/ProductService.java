package com.Learning.SpringThings.Service;

import java.util.List;

import com.Learning.SpringThings.dto.ProductDto;

public interface ProductService {

	public ProductDto saveProducts(ProductDto productDto);
	public ProductDto getProductById(int productId);
	public void deleteProductById( int productId);
	public List<ProductDto> getProductByAll();
}
