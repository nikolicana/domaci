package d10_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		

		SmartAirConditioning prva=new SmartAirConditioning();
		
		prva.brand= "Philips";
		prva.function= "warms";
		prva.temp=28;
		prva.print();
		
        SmartAirConditioning druga=new SmartAirConditioning();
		
		druga.brand= "Tesla";
		druga.function= "cool";
		druga.temp=18;
		druga.print();
		
	}

}
