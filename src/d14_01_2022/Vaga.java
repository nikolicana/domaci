package d14_01_2022;

public class Vaga {
//	Kreirati klasu Vaga koja ima:
//		merna jedinica (kg ili lb)
//		proizvod (proizvod koji se meri)
//		default-ni konstuktor
//		getteri i setteri za sve atribute
//		metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije).
//		Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
//		metodu stampaj koja stampa racun u formatu:
//		               (sifra) - (naziv)
//		   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//		   Ukupno: (ukupna cena) 	      

private String mernaJedinica;
private Proizvod proizvod;


public String getMernaJedinica() {
	return this.mernaJedinica;
}

public void setMernaJedinica(String mernaJedinica) {
	this.mernaJedinica=mernaJedinica;
}
public Proizvod getProizvod() {
	return this.proizvod;
}
public void setProizvod(Proizvod proizvod) {
	this.proizvod=proizvod;
}
public double sracunajCenu(int tezina) {
	double cena=0;
	if (this.mernaJedinica.equals("kg")) {
		 cena=tezina*this.getProizvod().getCenaKg();
	}else if(this.mernaJedinica.equals("lb")) {
		cena=tezina*this.getProizvod().getCenaLb();
		}
	
	return cena;
}

	public void stampajRacun(int tezina) {
		 

		this.getProizvod().printProizvod();

		if (this.mernaJedinica.equals("kg")) {
			System.out.println(this.getProizvod().getCenaKg() + " - " + this.mernaJedinica + " x " + tezina);
		} else if (this.mernaJedinica.equals("lb")) {
			System.out.println(this.getProizvod().getCenaLb() + " - " + this.mernaJedinica + " x " + tezina);
		}
		System.out.println("ukupno: " + this.sracunajCenu(tezina));
	}
}
