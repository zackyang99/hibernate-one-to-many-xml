package hibernate.model;

public class Product {
	private long id;
	private String name;
	private String description;
	private float price;
	private Category category;
	
	public Product() {
		
	}
	
	public Product(String name, String description, float price, Category category) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;
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
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getPrice() {
		return price;
	}
	
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Category getCategory() {
		return category;
	}

}
