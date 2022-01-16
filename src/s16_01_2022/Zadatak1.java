package s16_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Osoba bakaM=new Osoba("Smilja Ciric",1933,"z");
		Osoba dekaM=new Osoba("Stanimir Ciric",1932,"m");
		Osoba bakaT=new Osoba("Desanka Nikolic",1936,"z");
		Osoba dekaT=new Osoba("Slavoljub Nikolic",1935,"m");
		Osoba majka=new Osoba("Dusanka Nikolic",1952,"z");
		majka.setMajka(bakaM);
		majka.setOtac(dekaM);
		Osoba otac=new Osoba("Slobodan Nikolic",1958,"m");
		otac.setMajka(bakaT);
		otac.setOtac(dekaT);
		Osoba ja=new Osoba("Ana Nikolic",1988,"z");
		ja.setMajka(majka);
		ja.setOtac(otac);
		
	

   ja.print();
   majka.print();
   otac.print();
	}

}
