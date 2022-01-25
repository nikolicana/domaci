package d24_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

//U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih
//tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.
		
		Ambalaza prva = new Tetrapak("1255-555550", "Mleko", 50, 70, true, 80);
		Ambalaza druga = new Tetrapak("1258-985", "Sok", 40, 50, true, 100);

		Ambalaza treca = new StaklenaAmbalaza("859412-8855", "Pivo", 20, 30, 10, true, 50);

		Korpa jedan = new Korpa();
		jedan.dodajAmbalazu(prva);

		jedan.dodajAmbalazu(treca);

		SuperKartica a = new SuperKartica("12565-555-6555", "Ana Nikolic", 20);

		System.out.println(prva.cena());
		System.out.println(treca.cena());
		System.out.println(jedan.cenaKorpe(a));
            
		
	}

}
