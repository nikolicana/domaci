package d24_01_2022;

public class Tetrapak extends Ambalaza {
	
	private boolean mozeReciklaza;
	private double osnovnaCena;

	public Tetrapak (String barKod,String nazivArtikla, int netoTezina, int brutoTezina,boolean mozeReciklaza, double osnovnaCena) {
	    super(barKod, nazivArtikla, netoTezina, brutoTezina);
		this.mozeReciklaza=mozeReciklaza;
		this.osnovnaCena=osnovnaCena;
	}
	
	
	public boolean isMozeReciklaza() {
		return mozeReciklaza;
	}


	public void setMozeReciklaza(boolean mozeReciklaza) {
		this.mozeReciklaza = mozeReciklaza;
	}


	public double getOsnovnaCena() {
		return osnovnaCena;
	}


	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}


	@Override
	public double cena() {
		double cena=0;
		if(mozeReciklaza) {
			cena=this.tezinaPakovanja()*1.5+this.osnovnaCena;
		}else {
			cena=this.osnovnaCena;
		}
		return cena;
	}

	@Override
	public void print() {
		System.out.println("Naziv artikla: "+this.nazivArtikla+" Bar kod: "+this.barKod);
		System.out.println("Neto tezina artikla: "+this.netoTezina+"  Bruto tezina artikla: "+this.brutoTezina);
		if (this.mozeReciklaza) {
			System.out.println("Proizvod moze da se reciklira. ");
		}else {
			System.out.println("Proizvod ne moze da se reciklira. ");
		}
		System.out.println("Osnovna cena proizvoda je :"+this.osnovnaCena);
		System.out.println("Cena proizvoda je: "+this.cena());
		
	}
//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//		atribut koji kaze da li se moze reciklirati
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu tako da ispunjava uslova:
//		ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//		ako nije u cenu ulazi samo osnovna cena
//		metoda stampaj stampa sve podatke iz klase tetrapak.

}
