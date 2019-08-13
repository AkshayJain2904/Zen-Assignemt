package com.zensar.services.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entites.Product;
import com.zensar.services.business.ProductService;
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/products")
public class ProductResource {
	
	@Autowired
	private ProductService productService;

	
	  @DeleteMapping
	  public String delete(@RequestBody Product product) {
		  productService.removeProduct(product);
		  return "Product "+product+" deleted";
	  }
	 
	  @PostMapping 
	  public String insert(@RequestBody Product product) { 
		  productService.createProduct(product);
		  return "Product"+product.getProductId()+"created succesfully";
	  }
	  
	  
	/*
	 * @PostMapping public String insert(@RequestParam("id") int id,
	 * 
	 * @RequestParam("name")String name,
	 * 
	 * @RequestParam("brand") String brand,
	 * 
	 * @RequestParam("price")double price) { Product product=new
	 * Product(id,name,brand,price);
	 * 
	 * 
	 * return "Product"+id+"created succesfully"; }
	 */
	
	@GetMapping
	public List<Product> getAllProducts() {
		return productService.findAllProducts();
	}
	
	
	 @PutMapping
	 public String update(@RequestBody Product product)
	 {
		 productService.editProduct(product);
	 	return "Product "+product+" updated";
	 }
	
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") int pId) {
		return productService.findbyProduct(pId);
	}
	@GetMapping("/count")
	public int getProductCount() {
		return productService.findAllProducts().size();
		
	}
	
}
