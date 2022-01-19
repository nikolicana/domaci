package d17_01_2022;

public class Racun {
//	Kreirati klasu Racun koja ima:
//		broj racuna (npr: 170-289328923-23)
//		ime i prezime osobe
//		trenutno stanje na racunu (npr: 100, 1220)
//		gettere i setter za sve atribute, sem settera za stanje na racunu
//		metodu koja menja stanje na racunu za prosledjenu vrednost 
//		(stanje na racunu ne moze da bude manje od nule)
//		metodu koja stampa podatke o racunu u formatu:
//		Ime i prezime  -  broj racuna
//		stanje na racunu je (trenutno stanje) rsd.

	private String brojRacuna;
	private String imePrezime;
	private double trenutnoStanje;
	
	public Racun(String brojRacuna,String imePrezime,double trenutnoStanje) {
		this.brojRacuna=brojRacuna;
		this.imePrezime=imePrezime;
		this.trenutnoStanje=trenutnoStanje;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public double getTrenutnoStanje() {
		return trenutnoStanje;
	}

	public void setTrenutnoStanje(int trenutnoStanje) {
		this.trenutnoStanje = trenutnoStanje;
	}
	
	
//	metodu koja menja stanje na racunu za prosledjenu vrednost 
//	(stanje na racunu ne moze da bude manje od nule)
	
	public double menjaStanje(double vrednost) {
		this.trenutnoStanje=this.trenutnoStanje+vrednost;
		return this.trenutnoStanje;
		
	}
	
	
//	metodu koja stampa podatke o racunu u formatu:
//	Ime i prezime  -  broj racuna
//	stanje na racunu je (trenutno stanje) rsd.
	
	public void print () {
		System.out.println(this.imePrezime+" "+this.brojRacuna);
		System.out.println("Stanje na racunu je: "+this.getTrenutnoStanje());
	}
}
