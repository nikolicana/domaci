package s16_01_2022;

public class Osoba {
//	Kreirati klasu Osoba koja ima:
//		Ime i prezime
//		godinu rodjenja
//		pol
//		oca- koji je takodje Osoba
//		majku - takodje je Osoba
//		Gettere i settere
//		difoltni konstruktor
//		konstruktor koji postavlja ime i prezime i godinu rodjenja i pol
//		metodu za stampu koja stampa ovako:
//		Ime i prezime, godina rodjenja [pol]
//		(ako je cale setovan)
//		OTAC: 
//		Stampamo caleta preko njegove metode za stampu
//		(Ako je majka setovana)
//		MAJKA:
//		Stampamo majku preko njene metode za stampu
//		U glavom programu kreirajte svoje porodicno stablo bar do babe i dede :grin:
//		Da vas odmah usmerim, IMAMO SAAAAAMO JEDNU KLASU OSOBA  i imamo main program nista vise od klasa vam ne treba!  (edited) 
	private String imePrezime;
	private int godinaR;
	private String pol;
	private Osoba otac;
	private Osoba majka;
	
	public Osoba() {
		
	}
	public Osoba(String imePrezime, int godinaR, String pol) {
		this.imePrezime=imePrezime;
		this.godinaR=godinaR;
		this.pol=pol;
	}
	
	public String getImePrezime() {
		return this.imePrezime;
	}
	public void setImePrezina(String imePrezime) {
		this.imePrezime=imePrezime;
	}
	public int getGodinaR() {
		return this.godinaR;
	}
	public void setGodinaR(int godinaR) {
		this.godinaR=godinaR;
	}
	public String getPol() {
		return this.pol;
	}
	public void setPol(String pol) {
		this.pol=pol;
	}
	public Osoba getOtac() {
		return this.otac;
	}
	public void setOtac(Osoba otac) {
		this.otac=otac;
	}
	public Osoba getMajka() {
		return this.majka;
	}
	public void setMajka(Osoba majka) {
		this.majka=majka;
		
	}



	public void print() {
		System.out.println(this.imePrezime + " " + this.godinaR + " " + this.pol);
		System.out.println("Majka: "+this.majka.imePrezime+" "+this.majka.godinaR+" "+this.majka.pol);
		System.out.println("Otac: "+this.otac.imePrezime+" "+this.otac.godinaR+" "+this.otac.pol);
	

	}

}