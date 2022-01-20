package d18_01_2022;

import java.util.ArrayList;

public class Listic {

//	Kreirati klasu Listic koja ima: 
//niz kombinacija - maksimalno 7 kombinacija
//metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//metodu koja vraca da li je kombinacija dobitna. Kao parametar se prosledjuje kombinacija za proveru. 
//Metoda prolazi kroz sve elemente niza i proverava da li u nizu postoji prosledjena kombinacija.
//Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
//Zaglavlje metode 
//public boolean dobitna(Kombinacija dobitnaKombinacija)
//metodu koja stampa listic u formatu
//ID: id kombinacije
//brojevi: 1, 3, 5, 14, 15, 21, 23
//
//ID: id kombinacije
//brojevi: 1, 3, 5, 14, 15, 21, 23
//
//�� i tako za sve kombinacije
	private ArrayList<Kombinacija> nizKombinacija= new ArrayList<Kombinacija>();
	
	
	public void dodajKombinaciju(Kombinacija kombinacija) {
		this.nizKombinacija.add(kombinacija);
	}
	public boolean dobitna(Kombinacija dobitnaKombinacija) {
		boolean dobitna=false;
		for (int i=0;i<nizKombinacija.size();i++) {
			if (this.nizKombinacija.get(i).daLiJeIstaKombinacija(dobitnaKombinacija)) {
				dobitna=true;
			}
		}
		return dobitna;
	}
	
	public void printListica() {
		for (int i=0;i<nizKombinacija.size();i++){
			this.nizKombinacija.get(i).print();
		}
	}
}
