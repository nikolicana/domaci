package d14_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		//U glavnom programu napraviti vise autora sa vise knjiga.

	Autor sk= new Autor("Stiven","King");
	Autor fb= new Autor("Fredrik", "Bakman");
	
	Knjiga prva=new Knjiga("125-6512-66684","Crveni mercedes", 2014, sk);
	
	Knjiga druga= new Knjiga("125-854-664428", "Kraj bdenja", 2018, sk);
	
	Knjiga treca= new Knjiga("142-6548-621","Moja baka vam se izvinjava",2018,fb);
	Knjiga cetvrta=new Knjiga("2563-658-6512","Covek po imenu Uve", 2012, fb);
		

	
	prva.print1();
	System.out.println();
	druga.print1();
	System.out.println();
	treca.print1();
	System.out.println();
	cetvrta.print1();
	}

}
