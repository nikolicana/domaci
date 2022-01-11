package d11_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		
		SmartAirConditioning samsung=new SmartAirConditioning();
		samsung.marka="Samsung";
		samsung.potrosnjaGreje=2;
		samsung.potrosnjaHladi=1;
		samsung.mod="hladi";
		samsung.izabranaTemperatura=18;
		
		
		samsung.print();
		System.out.println("Mesecna potrosnja ove klime iznosi: "+samsung.mesecnaPotrosnja());
		System.out.println("Cena mesecne potrosnje iznosi: "+samsung.cenaMesecnePotrosnje());

	}

}
