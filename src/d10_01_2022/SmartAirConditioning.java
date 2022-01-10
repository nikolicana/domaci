package d10_01_2022;

public class SmartAirConditioning {

	String brand;
	int temp;
	String function;
	
	public void print () {
		System.out.println( "Brend klime je: "+this.brand);
		System.out.println( "Osnovna funkcija klime: "+this.function);
		System.out.println( "Izabrana temperatura: "+this.temp);
	}
}
