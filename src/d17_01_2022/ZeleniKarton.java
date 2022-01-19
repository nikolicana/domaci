package d17_01_2022;

public class ZeleniKarton {
//	Zadatak
//	Kreirati klasu ZeleniKarton koja ima:
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime
private String imeStudenta;
private String prezimeStudenta;
private int brojIndexa;
private String nazivPredmeta;
private String imeProfesora;
private String prezimeProfesora;
private int ocena;

public ZeleniKarton (String imeStudenta, String prezimeStudenta,int brojIndexa,String nazivPredmeta,String imeProfesora,String prezimeProfesora,int ocena) {
	this.prezimeStudenta=prezimeStudenta;
	this.imeStudenta=imeStudenta;
	this.brojIndexa=brojIndexa;
	this.nazivPredmeta=nazivPredmeta;
	this.imeProfesora=imeProfesora;
	this.prezimeProfesora=prezimeProfesora;
	this.ocena=ocena;
}
public String getImeStudenta() {
	return this.imeStudenta;
}
public void setImeStudenta(String imeStudenta) {
	this.imeStudenta=imeStudenta;
}

public String getPrezimeStudenta() {
	return this.prezimeStudenta;
}
public void setPrezimeStudenta(String prezimeStudenta) {
	this.prezimeStudenta=prezimeStudenta;
}
public int getBrojIndexa() {
	return this.brojIndexa;
}
public void setBrojIndexa(int brojIndexa) {
	this.brojIndexa=brojIndexa;
}
public String getNazivPredmeta() {
	return this.nazivPredmeta;
}
public void setNazivPredmeta(String nazivPredmeta) {
	this.nazivPredmeta=nazivPredmeta;
}
public String getImeProfesora() {
	return this.imeProfesora;
}
public void setImeProfesora(String imeProfesora) {
	this.imeProfesora=imeProfesora;
}
public String getPrezimeProfesora() {
	return this.prezimeProfesora;
}
public void setPrezimeProfesora(String prezimeProfesora) {
	this.prezimeProfesora=prezimeProfesora;
}
public int getOcena() {
	return this.ocena;
}
public void setOcena(int ocena) {
	this.ocena=ocena;
}
public boolean polozen() {
	boolean polozen=false;
	if(this.getOcena()>5) {
		polozen=true;
	}
	return polozen;
}
public void print() {
	
	if (this.polozen()) {
	System.out.println("Naziv predmeta: "+this.nazivPredmeta+"Ocena: "+this.ocena);
}else  {
	System.out.println("Naziv predmeta: "+this.nazivPredmeta+"Ocena:5 "+ "nije polozen ispit");
}
	System.out.println("Student: "+this.imeStudenta+" "+this.prezimeStudenta+" " + "Broj indexa: "+this.brojIndexa);
	System.out.println("Profesor: "+this.imeProfesora+" "+this.prezimeProfesora);
}

}