package d24_01_2022;

import java.util.ArrayList;

public class Korpa {
	
	private ArrayList <Ambalaza> nizAmbalaza=new ArrayList <Ambalaza>();
	public Korpa() {
		
	}
	
	public void dodajAmbalazu(Ambalaza ambalaza) {
		nizAmbalaza.add(ambalaza);
	}
	
	public void izbaciAmbalazu(String barKod) {
		for (int i=0;i<nizAmbalaza.size();i++) {
			if(this.nizAmbalaza.get(i).barKod.equals(barKod)) {
				nizAmbalaza.remove(i);
			}
		}
		
	}
	private double cenaSaPopustom(int popust) {
		double cenaSaPopustom=0;
		for (int i=0;i<nizAmbalaza.size();i++) {
			 cenaSaPopustom= cenaSaPopustom+nizAmbalaza.get(i).cena();
		}
		return cenaSaPopustom-popust;
	}
	
	public double cenaKorpe(SuperKartica kartica) {
		
		return cenaSaPopustom(kartica.getPopust());
	}
	
//	Kreirati klasu Korpa koja ima:
//		niz ambalaza
//		metodu dodaj ambalazu
//		metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//		privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//		metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije 
//		se prima Super karticu iz koje se cita popust.
//
//		U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Amdoublbalaza razlicitih tipova 
//		i istestirati sve metode i ispisati ukupnu cenu sa popustom.
 
}
