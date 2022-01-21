package d21_01_2022;

public class Magacioner extends Radnik {

	public Magacioner() {
		super();
	}

//Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
// ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
// suma plata svih sektor / broj sektora * 0.5
// override uje metodu za platu, tako da se plata racuna po formuli:
//(prosecna plata za sve sektore u kojima radi) * (broj sektora).
	
	private double prosecnaPlataSektora() {
	double	sumaPlata=0;
		for(int i=0;i<nizSektora.size();i++) {
			sumaPlata=sumaPlata+nizSektora.get(i).plata;
		}
		double prosecnaPlataSektora= sumaPlata/nizSektora.size()*0.5;
		return prosecnaPlataSektora;
	}
	
	@Override
	public double plata() {
		double plata=this.prosecnaPlataSektora()*nizSektora.size();
		return plata;

	}

}
