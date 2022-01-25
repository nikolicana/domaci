package d24_01_2022;

public class SuperKartica {

	private String brojKartice;
	private String imePrezime;
	private int popust;
	
	
	
	public SuperKartica() {
		
	}
	
	public SuperKartica(String brojKartice,String imePrezime, int popust) {
		this.brojKartice=brojKartice;
		this.imePrezime=imePrezime;
		this.popust=popust;
		
	}

	public String getBrojKartice() {
		return brojKartice;
	}

	public void setBrojKartice(String brojKartice) {
		this.brojKartice = brojKartice;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public int getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}
	
	public void print() {
		System.out.println(this.brojKartice+" "+this.imePrezime);
	}
//Kreirati klasu SuperKartica koja ima:
//broj kartice
//ime i prezime vlasnika
//popust (200, 500, … )
//konstuktore (default-ni i sa parametrima)
//gettere i settere 
//metodu stampaj koja stampa karticu u formatu:
//(broj kartice), (ime i prezime)

}
