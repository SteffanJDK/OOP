
public class Lesapplication {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Hello world!");
	//product aanmaken
	Product product1 = new Product();
	//product vullen
	product1.name = "TV";
	product1.price = 120;
	product1.printDetails();
	product1.stelPrijsIn(290);
	product1.printDetails();
	
	//String             = String
	String productNaam = product1.watIsDeNaam();

	Product product2 = new Product();
	product2.name = "Wasmachine";
	product2.price = 300;
	product2.printDetails();
	
	Product product3 = new Product("Fiets", 23, false);
	
	}
}
