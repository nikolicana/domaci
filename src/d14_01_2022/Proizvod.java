package d14_01_2022;

public class Proizvod {
//	(Za vezbanje) Kreirati klasu Proizvod koja ima:
//		sifru proizvoda
//		naziv proizvoda
//		cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
//		konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
//		gettere i settere za sifru i naziv
//		setter za cenu po kilogramu
//		metodu getCenaKg koja vraca cenu za 1 kg proizvoda
//		metodu getCenaLb koja vraca cenu za 1lb prozvoda
//		 		konverzija: 1 kg = 2.2046 lb
//		metodu koja stampa proizvod u formatu:
//		(sifra) - (naziv)

      private int sifra;
      private String naziv;
      private double cenaKg;
      
      
      public Proizvod(int sifra, String naziv, double cenaKg) {
    	  this.sifra=sifra;
    	  this.naziv=naziv;
    	  this.cenaKg=cenaKg;
      }
      
      public int getSifra() {
    	  return this.sifra;
      }
      public void setSifra(int sifra) {
    	  this.sifra=sifra;
      }
      public String getNaziv() {
    	  return this.naziv;
      }
      public void setNaziv(String naziv) {
    	  this.naziv=naziv;
      }
      public void setCenaKg(double cenaKg) {
    	  this.cenaKg=cenaKg;
      }
      public double getCenaKg() {
    	  return this.cenaKg;
      }
      public double getCenaLb() {
    	  double cenaLb=this.getCenaKg()/2.2046;
    	  return cenaLb;
      }
      
      public void printProizvod() {
    	  System.out.println(this.sifra+" - "+this.naziv);
      }
}
