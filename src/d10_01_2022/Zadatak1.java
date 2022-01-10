package d10_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		
		Proizvod voce=new Proizvod();
		voce.name="lubenica";
		voce.price=115.5; //rsd
		voce.weight =5;  //kg
		
		voce.print();
		
		Proizvod povrce=new Proizvod();
		povrce.name="krompir";
		povrce.price=80;
		povrce.weight=3;
		
		povrce.print();
	}

}
