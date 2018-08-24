package hibernate.model;

import java.util.Set;

public class Category {
	private long id;
	private String name;
	
	private Set<Product> products;
	
	public Category() {
		
	}
	
	public Category(String name) {
		this.name = name;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	public Set<Product> getProducts() {
		return products;
	}

}
