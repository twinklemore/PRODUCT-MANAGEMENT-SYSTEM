package com.company.controller;

import com.company.dto.Product;
import com.company.service.ProductService;

public class ProductController {
	public static void main(String[] args) {
		Product product=new Product();
		product.setId(24);
		product.setName("rings");
		product.setPrice(6000);
		
		ProductService productservice=new ProductService();
		Product p=productservice.saveProduct(product);
		
		if(p!=null) {
			System.out.println(p.getId()+" product is saved");
			System.out.println("******************************");
		}
		if(p!=null) {
			System.out.println(p.getPrice()+" product is retrieved!!!");
			System.out.println("******************************");
		}
		if(p!=null) {
			System.out.println(p.getName()+" retrieved all !!!");
			System.out.println("******************************");
		}
	if(p!=null) {
		System.out.println(p.getName()+" deleted the product !!!");
		System.out.println("******************************");
	}
	if(p!=null) {
		System.out.println(p.getPrice()+" updated the product !!!");
		System.out.println("******************************");
	}
	}
}
