package d11_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		 FacebookPost prvi =new FacebookPost();
		 prvi.imePrezimeObjavio= "Milan Jovanovic";
		 prvi.imePrezimeGdeJe= "Vladimir Minic";
		 prvi.tekst= "Hoces da gledamo testove 50/50? Vodim na pivo :D";
		 prvi.brojLajkova=10;
		 prvi.brojDeljenja=29;   
		 
		 FacebookPost drugi= new FacebookPost();
		 drugi.imePrezimeObjavio="Vladimir Minic";
		 drugi.imePrezimeGdeJe= "Milan Jovanovic";
		 drugi.tekst= "Nema te kolicine piva Milane :D";
		 drugi.brojLajkova=20;
		 drugi.brojDeljenja=5;

		 prvi.print();
		 System.out.println();
		 drugi.print();
		 
		 
		 
		 prvi.like();
		 prvi.like();
		 prvi.dislike();
		 prvi.share();
		 prvi.share();
		 System.out.println("Broj lajkova nakon sto su jos 3 korisnika videla Milanov post: "+prvi.brojLajkova);
		 System.out.println("Broj serova nakon sto su jos 3 korisnika videla Milanov post: "+prvi.brojDeljenja);
		 
		 
		 drugi.like();
		 drugi.like();
		 drugi.like();
		 drugi.dislike();
		 drugi.share();
	
		 System.out.println("Broj lajkova nakon sto su jos 4 korisnika videla Vladin post: "+drugi.brojLajkova);
		 System.out.println("Broj serova nakon sto su jos 4 korisnika videla Vladin post: "+drugi.brojDeljenja);
		 
		 
		 
		 
	}

}
