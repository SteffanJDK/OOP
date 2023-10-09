
public class Application {

	public static void main(String[] args) {
		
	Cat cat1 = new Cat();
	cat1.makeSound();
	cat1.setName("Milloes");
	cat1.setLegs(4);
	
	Dog dog1 = new Dog();
	dog1.setName("Max");
	dog1.setLegs(4);
	
	Dog dog2 = new Dog();
	dog2.setName("Rex");
	dog2.setLegs(4);
	
	Car car1 = new Car();
	car1.seats = 4;
	car1.brandName = "Volvo";
	car1.electric = false;
	car1.color = "rood";
	car1.horsepower = 120;
	car1.buildYear = 2008;
	car1.printBrandBuild();
	car1.printColor();
	car1.stelBouwJaar(2009);
	car1.stelBrandNaam("Mercedes");
	car1.printBrandBuild();
	
	int stoelen = car1.aantalStoelen();
	boolean isElektrisch = car1.isElektrisch();
	System.out.println("De auto heeft " + stoelen + " stoelen");
	System.out.println("Auto is elektrisch? " + isElektrisch);
	
	Car car2 = new Car();
	car2.seats = 4;
	car2.brandName = "Audi";
	car2.electric = false;
	car2.color = "grijs";
	car2.horsepower = 145;
	car2.buildYear = 2012;
	car2.printBrandBuild();
	car2.printColor();
	car2.stelBouwJaar(2011);
	car2.stelBrandNaam("Mini-cooper");
	car2.printBrandBuild();
	
	int stoelen2 = car2.aantalStoelen();
	boolean isElektrisch2 = car2.isElektrisch();
	System.out.println("De auto heeft " + stoelen2 + " stoelen");
	System.out.println("Auto is elektrisch? " + isElektrisch2);
	
	Car car3 = new Car(4, "Volvo", true, "rood", 150, 2018);
	car3.printAll();
	
	}
}
