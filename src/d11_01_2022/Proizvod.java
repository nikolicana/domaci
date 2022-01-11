package d11_01_2022;

public class Proizvod {

	String naziv;
	double cena;
	double tezina;
	
	public void print() {
		System.out.println(this.naziv+" "+this.cena +"rsd"+" "+this.tezina +"gr");
	}
	
	public void povecajCenu(int povecanje) {
		this.cena=this.cena+povecanje;
	}
	public double vratiCenuSaPopustom(int popust) {
		double cenaSaPopustom;
		return cenaSaPopustom=this.cena-this.cena*popust/100;
	}
	
	public double racunajPostarinu() {
		int postarina=0;
		if (this.tezina<=100) {
			postarina=200;
		}else if(this.tezina<=500) {
			postarina=400;
		}else {
			postarina=1000;
		}
		return postarina;
	}
}
