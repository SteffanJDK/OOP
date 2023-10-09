
public class Product {

	private String name;
	
	private int price;
	
	private boolean soldOut;
	
	public Product() {
		System.out.println("Hello world");
		
		name = "Onbekend";
		price = 100;
	}
	
	public Product(String name, int price, boolean soldOut) {
		this.name = name;
		this.price = price;
		this.soldOut = soldOut;
	}
	
	public void method1() {
		
	}
	
	public void printDetails() {
		System.out.println("Product met naam " + name);
		System.out.println("  heeft prijs " + price);
	}
	
	public void stelPrijsIn(int price) {
		// this > het huidige object
		this.price = price;
		// Argument = Property
	}
	
	public String watIsDeNaam() {
		return name;
	}
	public int watisDePrijs() {
		return price;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		if (price >= 0 && price < 100000);
			this.price = price;
	}
}
