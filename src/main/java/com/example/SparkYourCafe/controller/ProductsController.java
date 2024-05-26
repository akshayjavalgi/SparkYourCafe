package com.example.SparkYourCafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SparkYourCafe.Entity.Products;
import com.example.SparkYourCafe.service.ProductsService;

@RestController
@RequestMapping("/products")
public class ProductsController {

	 @Autowired
	    private ProductsService productsService;

	    @PostMapping
	    public ResponseEntity<Products> createProduct(@RequestBody Products product) {
	        Products createdProduct = productsService.createProduct(product);
	        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
	    }

	    @GetMapping("/allProducts")
	    public ResponseEntity<List<Products>> getAllProducts() {
	        List<Products> products = productsService.getAllProducts();
	        return new ResponseEntity<>(products, HttpStatus.OK);
	    }

	    @GetMapping("/{productId}")
	    public ResponseEntity<Products> getProductById(@PathVariable long productId) {
	    	Products product = productsService.getProductById(productId);
	        if (product != null) {
	            return new ResponseEntity<>(product, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @PutMapping("/{productId}")
	    public ResponseEntity<Products> updateProduct(@PathVariable long productId, @RequestBody Products product) {
	    	Products updatedProduct = productsService.updateProduct(productId, product);
	        if (updatedProduct != null) {
	            return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @DeleteMapping("/{productId}")
	    public ResponseEntity<Void> deleteProduct(@PathVariable long productId) {
	        productsService.deleteProduct(productId);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    @GetMapping("/category/{categoryId}")
	    public ResponseEntity<List<Products>> getProductsByCategory(@PathVariable long categoryId) {
	        List<Products> products = productsService.getProductsByCategory(categoryId);
	        return new ResponseEntity<>(products, HttpStatus.OK);
	    }

	    @GetMapping("/search")
	    public ResponseEntity<List<Products>> searchProductsByName(@RequestParam String name) {
	        List<Products> products = productsService.searchProductsByName(name);
	        return new ResponseEntity<>(products, HttpStatus.OK);
	    }

	    @GetMapping("/search")
	    public ResponseEntity<List<Products>> searchProductsByPrice(@RequestParam double price) {
	        List<Products> products = productsService.searchProductsByPrice(price);
	        return new ResponseEntity<>(products, HttpStatus.OK);
	    }
}
