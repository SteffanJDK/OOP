
public class Car {
	
	public int seats;
	public String brandName;
	public boolean electric;
	public String color;
	public int horsepower;
	public int buildYear;
	
	public Car() {
		
	}
	
	public Car(int seats, String brandName, boolean electric, String color, int horsepower, int buildYear) {
		this.seats = seats;
		this.brandName = brandName;
		this.electric = electric;
		this.color = color;
		this.horsepower = horsepower;
		this.buildYear = buildYear;
	}
	
	public void printAll() {
		System.out.println("De auto heeft " + seats + " stoelen");
		System.out.println("Merk van de auto is " + brandName);
		System.out.println("De auto heeft als elektrische waarde " + electric);
		System.out.println("De kleur van de auto " + color);
		System.out.println("De auto heeft zoveel PK " + horsepower);
		System.out.println("De auto is gemaakt in het jaar " + buildYear);
	}
	
	public void printBrandBuild() {
		System.out.println("Bouwjaar van de auto is " + buildYear);
		System.out.println("Merk van de auto is " + brandName);
	}
	
	public void printColor() {
		System.out.println("De kleur van de auto " + color);
	}
	
	public void stelBouwJaar(int buildYear) {
		this.buildYear = buildYear;
	}
	
	public void stelBrandNaam(String brandName) {
		this.brandName = brandName;
	}
	
	public int aantalStoelen(){
		return seats;
	}
	
	public boolean isElektrisch() {
		return electric;
	}
}

