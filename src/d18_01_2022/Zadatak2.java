package d18_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		Kombinacija prva=new Kombinacija("a",5,8,35,25,12,10,9);
		Kombinacija druga=new Kombinacija("b",5,4,35,17,15,1,4);
		Kombinacija treca=new Kombinacija("c",2,8,18,17,11,10,9);
		Kombinacija cetvrta=new Kombinacija("d",5,10,28,26,13,1,5);
		Kombinacija peta=new Kombinacija("e",8,7,36,26,6,12,15);
        
		
		
		Listic prvi=new Listic();
		prvi.dodajKombinaciju(prva);
		prvi.dodajKombinaciju(druga);
		prvi.dodajKombinaciju(treca);
		prvi.dodajKombinaciju(cetvrta);
		prvi.dodajKombinaciju(peta);
		
		
		if (prvi.dobitna(cetvrta)) {
			System.out.println("KOmbinacija je dobitna: ");
			
		}else {
			System.out.println("Kombinacija nije dobitna");
		}
		prvi.printListica();
	}

}
