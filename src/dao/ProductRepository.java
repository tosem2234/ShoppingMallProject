package dao;

import java.util.ArrayList;

import dto.Product;


public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	
	public ProductRepository() {
	
		Product phone = new Product("P1234", "iPhone 12", 1000000);
		phone.setDescription("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		
		Product notebook = new Product("P1235", "LG Pc �׷�", 1500000);
		notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation Intel Core Pocessors");
		notebook.setCategory("Notebook");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished");
		
		Product tablet = new Product("P1236", "Galaxy Tab 5", 900000);
		tablet.setDescription("212.8*123.6*6.6mm, Super AMOLED display, Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
		
		
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
		
	}
	
	public ArrayList<Product> getAllProducts(){
		return listOfProducts;
	}
	
	public Product getProductById(String productId) {
		Product productById = null;
		
		for(int i = 0; i<listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if(product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
}
