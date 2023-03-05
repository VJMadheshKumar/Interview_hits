package com.solutions7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StoreProduct {
	 Product product;

	public Product getProduct() {
	return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	static Scanner io = new Scanner(System.in);
	public static void main(String[] args) {
		Set<Product> products = new HashSet<>();
		System.out.println("Enter the details of 10 products");
		for (int i = 0; i < 3; i++) {
			products.add(setTenProducts());
		}
		productSearch(products);
		Removeproduct(products);
		
	}
	
	 static Product setTenProducts() {
		
		System.out.print("Enter Product number : ");
		String pId = io.nextLine();
		System.out.print("Enter Product name : ");
		String pName = io.nextLine();
		Product product = new Product(pId, pName);
		return product;

	}
	 static void productSearch(Set<Product> hashset) {
		 Product product;
		 System.out.print("Enter product number to search : ");
		 String check = io.nextLine();
		 Iterator<Product> iterator = hashset.iterator();
		 while(iterator.hasNext()) {
			 product =iterator.next();
			 if(product.getProductId().equals(check)) {
				System.out.println("Product found"+product);
			 }
			}
		 
		}
	 
	 static void Removeproduct(Set<Product> hashset) {
		 Product product;
		 System.out.print("Enter product number to delete : ");
		 String check = io.nextLine();
		 Iterator<Product> iterator = hashset.iterator();
		 while(iterator.hasNext()) {
			 product =iterator.next();
			 if(product.getProductId().equals(check)) {
				hashset.remove(product);
				System.out.println("removed successfully");
				
			 }
			}System.out.println(hashset);
		 
		}
		 
	 

}
