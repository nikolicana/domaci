package d18_01_2022;

import java.util.ArrayList;

public class Student {
//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)

private int brojIndexa;
private String ime;
private String prezime;
private String tipStudija;
private ArrayList<Ispit> listaIspita= new ArrayList<Ispit>();

public Student () {
	
}
public Student (int brojIndexa, String ime, String prezime,String tipStudija) {
	this.brojIndexa=brojIndexa;
	this.ime=ime;
	this.prezime=prezime;
	this.tipStudija=tipStudija;
}
public int getBrojIndexa() {
	return brojIndexa;
}
public void setBrojIndexa(int brojIndexa) {
	this.brojIndexa = brojIndexa;
}
public String getIme() {
	return ime;
}
public void setIme(String ime) {
	this.ime = ime;
}
public String getPrezime() {
	return prezime;
}
public void setPrezime(String prezime) {
	this.prezime = prezime;
}
public String getTipStudija() {
	return tipStudija;
}
public void setTipStudija(String tipStudija) {
	this.tipStudija = tipStudija;
}
public ArrayList<Ispit> getListaIspita() {
	return listaIspita;
}

//metodu dodaj ispit u niz ispita

public void dodajIspit(Ispit ispit) {
	this.listaIspita.add(ispit);
}
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)

public double prosek() {
	
	double zbir=0;
	int brojac=0;
	for(int i=0;i<listaIspita.size();i++) {
		if (this.listaIspita.get(i).polozen()) {
			zbir=zbir+this.listaIspita.get(i).getOcena();
			brojac++;
			
		}
		
	}
	return zbir/brojac;
	
}
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)

public void print() {
	System.out.println(this.brojIndexa+" - "+this.ime+" "+this.prezime+ " - "+this.tipStudija);
	System.out.println("Predmeti: ");
	for (int i=0;i<listaIspita.size();i++) {
		this.getListaIspita().get(i).print();
	}
	System.out.println("Prosecna ocena: "+this.prosek());
}
}
