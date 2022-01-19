package d17_01_2022;

public class Transakcija {
//	Kreirati klasu Transakcija koja ima:
//		id transakcije
//		racun sa kog se prenose sredstva
//		racun na koji se prenose sredstva
//		gettere i settere
//		konstruktore
//		privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//		ako je prenos sredstava manji od 4500, provizija je fiksna 45
//		ako je prenos sredstava veci od 4500, provizija je 1% 
//		S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
//		Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//		metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//		Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//		(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//		metodu koja stampa podatke o transakciji u formatu:
//		id transkacije
//		Racun sa: Ime i prezime  -  broj racuna
//		Racun na: Ime i prezime  -  broj racuna

	private int id;
	private Racun racunPrenos;
	private Racun racunPrima;
	public Transakcija (int id, Racun racunPrenos,Racun racunPrima) {
		this.id=id;
		this.racunPrenos=racunPrenos;
		this.racunPrima=racunPrima;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Racun getRacunPrenos() {
		return racunPrenos;
	}
	public void setRacunPrenos(Racun racunPrenos) {
		this.racunPrenos = racunPrenos;
	}
	public Racun getRacunPrima() {
		return racunPrima;
	}
	public void setRacunPrima(Racun racunPrima) {
		this.racunPrima = racunPrima;
	}
//	privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//		ako je prenos sredstava manji od 4500, provizija je fiksna 45
//		ako je prenos sredstava veci od 4500, provizija je 1% 
//		S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
	
	
	
	private double provizija(double vrednostTransakcije) {
		double provizija=0;
		if(vrednostTransakcije<4500) {
			 provizija=45;
		}else { 
			provizija=1*vrednostTransakcije/100;
	
		}
		return provizija;
	}
//	metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//	Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//	(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
	
	
	public void izvrsiTransakciju (int vrednostTransakcije) {
		 
		if (this.racunPrenos.getTrenutnoStanje()>vrednostTransakcije) {
			this.racunPrenos.menjaStanje(-vrednostTransakcije-this.provizija(vrednostTransakcije));
			this.racunPrima.menjaStanje(vrednostTransakcije);
		}
		
		
		
		
		
	}
//	metodu koja stampa podatke o transakciji u formatu:
//	id transkacije
//	Racun sa: Ime i prezime  -  broj racuna
//	Racun na: Ime i prezime  -  broj racuna
	
	public void stampajPodatke() {
		System.out.println(this.id);
		this.getRacunPrenos().print();
		this.getRacunPrima().print();
	}
}
