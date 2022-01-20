package d20_01_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		
		Igrac a=new Igrac ("Milos Milosevic", "250419857852",1985,15,"napad", false);
		Igrac b=new Igrac ("Jovan Jovanovic", "1105986256932",1986,10,"odbrana", true);
		
		Trener prvi=new Trener ("Jovo Jovetic","150497078252",1970,20,"pomocni");
		Trener drugi=new Trener ("MIle MIlic","0509876549225",1976,12,"personalni");
		
		a.print();
		prvi.print();
//		(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera
//		, na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.

		
		ArrayList<Igrac> nizIgraca= new ArrayList<Igrac>();
		Scanner s=new Scanner (System.in);
		for(int i=0;i<2;i++) {
			System.out.println("Unesite ime igraca: ");
			String imePrezime=s.next();
			System.out.println("Unesite broj igraca: ");
			int brojIgraca=s.nextInt();
			System.out.println("Unesite jmbg igraca: ");
			String jmbg=s.next();
			System.out.println("Unesite godinu rodjenja igraca: ");
			int godinaRodjenja=s.nextInt();
			System.out.println("Unesite poziciju igraca: ");
			String pozicija=s.next();
			System.out.println("Da li je igrac kapiten? ");
			boolean kapiten=s.nextBoolean();
			
			Igrac novi=new Igrac (imePrezime,jmbg,godinaRodjenja,brojIgraca,pozicija,kapiten);
			nizIgraca.add(novi);
			
			
		}

		for (int i=0;i<nizIgraca.size();i++) {
			
			nizIgraca.get(i).print();
		}
		
		ArrayList<Trener> nizTrenera= new ArrayList<Trener>();
	
		for(int i=0;i<2;i++) {
			System.out.println("Unesite ime trenera: ");
			String imePrezime=s.next();
			System.out.println("Unesite godine iskustva trenera: ");
			int godineIskustva=s.nextInt();
			System.out.println("Unesite jmbg trenera: ");
			String jmbg=s.next();
			System.out.println("Unesite godinu rodjenja trenera: ");
			int godinaRodjenja=s.nextInt();
			System.out.println("Unesite tip trenera: ");
			String tipTrenera=s.next();
			
			
			Trener novi=new Trener (imePrezime,jmbg,godinaRodjenja,godineIskustva,tipTrenera);
			nizTrenera.add(novi);
			
			
		}

		ArrayList<Trener> nizTenera= new ArrayList<Trener>();
		for (int i=0;i<nizTrenera.size();i++) {
			
			nizTrenera.get(i).print();
		}
	}

}

