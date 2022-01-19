package d17_01_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		ArrayList<ZeleniKarton> listaKartona = new ArrayList<ZeleniKarton>();
		int zbir=0;
		int brojac=0;
		int zbir1=0;
		int brojac1=0;
		
		for(int i=0;i<3;i++) {
			System.out.println("Unesite ime  studenta: ");
			String imeStudenta=s.next();
			System.out.println("Unesite prezime  studenta: ");
			String prezimeStudenta=s.next();
		
			System.out.println("Unesite broj indexa studenta: ");
			int brojIndexa=s.nextInt();
			
			System.out.println("Unesite naziv predmeta: ");
			String naziv=s.next();
			
			System.out.println("Unesite ime profesora: ");
			String imeProfesora=s.next();
			System.out.println("Unesite prezime profesora: ");
			String prezimeProfesora=s.next();
			
     		System.out.println("Unesite dobijenu ocenu: ");
			int ocena=s.nextInt();
			
			ZeleniKarton novi=new ZeleniKarton( imeStudenta,prezimeStudenta,  brojIndexa, naziv, imeProfesora, prezimeProfesora, ocena);
			listaKartona.add(novi);
			novi.polozen();
		}
		
		for (int i=0;i<listaKartona.size();i++) {
			
			listaKartona.get(i).print();
		}
		
		for (int i=0;i<listaKartona.size();i++) {

			zbir=zbir+listaKartona.get(i).getOcena();
			brojac++;
	
		}
		System.out.println("Prosecna ocena svih ispita je: "+zbir/brojac);
		
		
		for (int i=0;i<listaKartona.size();i++) {
			if (listaKartona.get(i).polozen()) {
				zbir1=zbir1+listaKartona.get(i).getOcena();
				 brojac1=brojac1+1;
			}

			
		}
		System.out.println("Prosecna ocena polozenih ispita je :" +zbir1/brojac1);

	}
	
	

}
