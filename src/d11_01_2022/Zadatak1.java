package d11_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Proizvod sveska=new Proizvod();
		sveska.naziv="Sveska A5";
		sveska.cena=25;
		sveska.tezina=250;
		
		Proizvod sestar=new Proizvod();
		sestar.naziv="Sestar";
		sestar.cena=350;
		sestar.tezina=500;
		
		sveska.print();
		sestar.print();
		
		System.out.println();
		int povecanje=15;
		sveska.povecajCenu(povecanje);
		System.out.println("Nova cena sveske je :"+sveska.cena);
		sestar.povecajCenu(povecanje);
		System.out.println("Nova cena sestara je :"+sestar.cena);
		
		int popust=20; //20%
		
		System.out.println("Cena sveske sa popustom je: "+ sveska.vratiCenuSaPopustom(popust));
		System.out.println("Cena sestara sa popustom je: "+sestar.vratiCenuSaPopustom(popust));
		
		
	System.out.println("Postarina za svesku iznosi: " +sveska.racunajPostarinu()+"rsd");
	System.out.println("Postarina za sestar iznosi: " +sestar.racunajPostarinu()+"rsd");
		
	}

}
