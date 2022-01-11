package d11_01_2022;

public class SmartAirConditioning {
	
	String marka;
	int potrosnjaHladi;
	int potrosnjaGreje;
	int izabranaTemperatura;
	String mod;
	
	
	public void print() {
		System.out.println(this.marka+" "+this.mod+" "+this.izabranaTemperatura+" stepeni");
	}
	
	public int mesecnaPotrosnja() {
		int mesecnaPotrosnja=0;
		if (this.mod.equals("hladi")) {
			mesecnaPotrosnja=30*15*this.potrosnjaHladi;
		}else if(this.mod.equals("greje")) {
			mesecnaPotrosnja=30*15*this.potrosnjaGreje;
		}
		return mesecnaPotrosnja;
	}
	
	public int cenaMesecnePotrosnje() {
		int cena=0;
		if (this.mesecnaPotrosnja()<=350) {
			cena=this.mesecnaPotrosnja()*6;
		}else {
			cena=(this.mesecnaPotrosnja()-350)*9+350*6;
		}
		return cena;
	}
	
}
