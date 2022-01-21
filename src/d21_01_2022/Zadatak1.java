package d21_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
	
		Sektor prvi= new Sektor("Finansije", 150000);
		Sektor drugi=new Sektor("Odrzavanje",80000);
		Sektor treci=new Sektor("IT",200000);
		
		Radnik a= new Menadzer();
		a.zaposliSeUSektor(prvi);
		a.zaposliSeUSektor(drugi);
		
		Radnik b=new Magacioner();
		b.zaposliSeUSektor(prvi);
		b.zaposliSeUSektor(drugi);
		b.zaposliSeUSektor(treci);
		
	

	System.out.println(	a.plata());
	System.out.println(	b.plata());

	}

}
