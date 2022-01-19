package d17_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Racun salje = new Racun("845-55558-5556","Ana NIkolic", 2500);
		Racun prima=new Racun("845-558-66643", "MIlena Milic", 1500);
		
		Transakcija prva=new Transakcija(1,salje,prima);
		 prva.stampajPodatke();
		
         prva.izvrsiTransakciju(2000);
         prva.stampajPodatke();
     
     
	}

	
}
