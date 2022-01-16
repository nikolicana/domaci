package d14_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		Proizvod banane=new Proizvod(58,"Banane",130);
		Proizvod kupus=new Proizvod(120,"Kupus",150);
		
		Vaga kg=new Vaga();
		kg.setProizvod(banane);
		kg.setMernaJedinica("kg");
		
		Vaga lb= new Vaga();
		lb.setProizvod(kupus);
		lb.setMernaJedinica("lb");
		
		
		int tezina=5;
		kg.stampajRacun(tezina);
		lb.stampajRacun(tezina);
			
		}

	}


