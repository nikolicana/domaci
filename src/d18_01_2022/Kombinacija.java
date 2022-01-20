package d18_01_2022;

import java.util.ArrayList;

public class Kombinacija {

//Za potrebe Lotto igre na srecu potrebno je 
//Kreirati klasu Kombinacija koja ima:
//id kombinacije (String)
//niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija. 
//Zaglavlje metode je:
//public boolean daLiJeIstaKombinacija( Kombinacija k)
//metoda vraca true ako su svi elementi na istim pozicija isti
//npr: this [0] == k [0], this [1] == k [1] …. 
//metodu za stampu koja stampa podatke u formatu
//ID: id kombinacije
//brojevi: 1, 3, 5, 14, 15, 21, 23
	private String id;
	private ArrayList<Integer> nizBrojeva= new ArrayList<Integer>();

	
	public Kombinacija(String id, int jedan, int dva, int tri,int cetiri,int pet,int sest, int sedam) {
		this.id=id;
		nizBrojeva.add(jedan);
		nizBrojeva.add(dva);
		nizBrojeva.add(tri);
		nizBrojeva.add(cetiri);
		nizBrojeva.add(pet);
		nizBrojeva.add(sest);
		nizBrojeva.add(sedam);
	}


	public String getId() {
		return id;
	}
   public void setId(String id) {
	   this.id=id;
   }

	public ArrayList<Integer> getNizBrojeva() {
		return nizBrojeva;
	}
	public boolean daLiJeIstaKombinacija( Kombinacija k) {
		boolean daLiJeIstaKombinacija=false;
		for(int i=0;i<7;i++) {
			if (this.nizBrojeva.get(i)==k.nizBrojeva.get(i)) {
				daLiJeIstaKombinacija=true;
			}
		}
		return daLiJeIstaKombinacija;
	}
	
	public void print() {
		System.out.println();
		System.out.println("ID: "+this.id+" "+" kombinacija");
		System.out.print("Brojevi :");
		for (int i=0;i<nizBrojeva.size();i++) {
			
			System.out.print( this.nizBrojeva.get(i)+", ");
			
		}
	}
}
