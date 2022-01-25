package d24_01_2022;

public class StaklenaAmbalaza extends Ambalaza {
	
	private double kaucija;
	private boolean placaSeKaucija;
	private double osnCena;
	
	public StaklenaAmbalaza(String barKod,String nazivArtikla, int netoTezina,
			int brutoTezina,double kaucija,boolean placaSeKaucija,double osnCena) {
		super(barKod, nazivArtikla, netoTezina, brutoTezina);
		this.kaucija=kaucija;
		this.placaSeKaucija=placaSeKaucija;
		this.osnCena=osnCena;
	}
	

	public double getKaucija() {
		return kaucija;
	}



	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}
	
	public boolean isPlacaSeKaucija() {
		return placaSeKaucija;
	}

	public void setPlacaSeKaucija(boolean placaSeKaucija) {
		this.placaSeKaucija = placaSeKaucija;
	}

	public double getOsnCena() {
		return osnCena;
	}


	public void setOsnCena(double osnCena) {
		this.osnCena = osnCena;
	}


	@Override
	public double cena() {
		double cena=0;
	    if (this.placaSeKaucija) {
	    	cena=this.osnCena*1.2+this.kaucija;
	    			
	    }else {
	    	cena=this.osnCena*1.2;
	    }
	    return cena;
	}
	
	@Override
	public void print() {
		System.out.println("Naziv artikla: "+this.nazivArtikla+" Bar kod: "+this.barKod);
		System.out.println("Neto tezina artikla: "+this.netoTezina+"  Bruto tezina artikla: "+this.brutoTezina+
				"Kaucija za staklo: "+this.kaucija);
		if (this.placaSeKaucija) {
			System.out.println("Kaucija se placa");
		}else {
			System.out.println("Kaucija se ne placa");
		}
		
		System.out.println("Osnovna cena proizvoda je :"+this.osnCena);
		System.out.println("Cena proizvoda je: "+this.cena());
		
	}
		
	}
	
//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//		kaucija za flasu
//		atribut koji kaze da li se za flasu placa kaucija
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu
//		ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//		ako se ne placa, (osnovna cena) * 1.2
//		metoda stampaj stampa sve podatke iz klase staklena flasa.



