package d18_01_2022;

public class Ispit {

//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet
//konstuktore koje mislite da ce vam trebati
//gettere i settere za sve atribute
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)
private String naziv;
private int ocena;
private String imeP;
private String prezimeP;

public Ispit (String naziv,int ocena,String imeP,String prezimeP) {
	this.naziv=naziv;
	this.ocena=ocena;
	this.imeP=imeP;
	this.prezimeP=prezimeP;
}

public String getNaziv() {
	return naziv;
}

public void setNaziv(String naziv) {
	this.naziv = naziv;
}

public int getOcena() {
	return ocena;
}

public void setOcena(int ocena) {
	this.ocena = ocena;
}

public String getImeP() {
	return imeP;
}

public void setImeP(String imeP) {
	this.imeP = imeP;
}

public String getPrezimeP() {
	return prezimeP;
}

public void setPrezimeP(String prezimeP) {
	this.prezimeP = prezimeP;
}

//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)

public boolean polozen() {
	boolean polozen=false;
	if(this.ocena>5 && this.ocena<11) {
		polozen=true;
	}
	return polozen;
}

public void print() {
	System.out.println(this.naziv+" - "+this.imeP+" "+this.prezimeP+" - "+this.ocena);
}
}
