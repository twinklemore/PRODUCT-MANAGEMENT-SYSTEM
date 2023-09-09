package com.company.service;

import com.company.dao.Productdao;
import com.company.dto.Product;

public class ProductService {
Productdao productdao=new Productdao();
public Product saveProduct(Product product){
	return productdao.saveProduct(product);	
}
public void retrieveProduct() {
	productdao.retrieveProduct();
}
public void retrieveallProducts() {
	productdao.retrieveallProducts();
}
public boolean deleteProductbyName(String Name) {
	return true;
	
	
}
public boolean updateProductPricebyName(double price,String Name) {
	return true;
}
}
