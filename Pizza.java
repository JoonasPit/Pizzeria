package pizzeria.model;

public class Pizza {
	private int pizzaId;
	private String  pizzaName, pizzaDescription;
	private double price;
	
	public Pizza() {
		pizzaId = 0;
		pizzaName = "";
		pizzaDescription = "";
		price = 0;
	}
	public Pizza(int pizzaId, String pizzaName, String pizzaDescription, double price) {
		this.pizzaId = pizzaId;
		this.pizzaName = pizzaName;
		this.pizzaDescription = pizzaDescription;
		this.price = price;
	}
	
	void setId(int pizzaId) {
		this.pizzaId = pizzaId;
	}
	void setName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	void setDesc(String pizzaDescription) {
		this.pizzaDescription = pizzaDescription;
	}
	void setPrice(double price) {
		this.price = price;
	}
	public int getpizzaId() {
		return pizzaId;
	}
	public String getpizzaName() {
		return pizzaName;
	}
	public String getpizzaDescription() {
		return pizzaDescription;
	}
	public double getPrice() {
		return price;
	}
	
	 public String toString() {
		return pizzaId + pizzaName + pizzaDescription + price;
	}
}