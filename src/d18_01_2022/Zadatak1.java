package d18_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Ispit prvi=new Ispit("Matematika",6,"Milos","Milosevic");
		Ispit drugi=new Ispit("Statistika",5,"Milos","Jovanovic");
		Ispit treci=new Ispit("Engleski",8,"Milena","Milosevic");
		Ispit cetvrti=new Ispit("Engleski",10,"Milena","Milosevic");
		 
		
		Student a=new Student (253,"Jovan","JOvanovic","master");
		a.dodajIspit(prvi);
		a.dodajIspit(drugi);
		a.dodajIspit(treci);
		a.dodajIspit(cetvrti);

		
		
		a.print();
	}

}
