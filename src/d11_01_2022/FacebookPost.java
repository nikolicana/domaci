package d11_01_2022;

public class FacebookPost {

	String imePrezimeObjavio;
	String imePrezimeGdeJe;
	String tekst;
	int brojLajkova;
	int brojDeljenja;
	
	
	public void like() {
		this.brojLajkova=this.brojLajkova+1;
	}
	
	
	public void dislike() {
		if (this.brojLajkova<0) {
			this.brojLajkova=0;
		}else {
			this.brojLajkova=this.brojLajkova-1;
		}
	}
	
	
	public void share() {
		this.brojDeljenja=this.brojDeljenja+1;
	}
	
	public void print() {
		
		System.out.println(this.imePrezimeObjavio+" >>> "+this.imePrezimeGdeJe);
		System.out.println(this.tekst);
		System.out.println(" Likes "+this.brojLajkova+" | "+"Shares "+this.brojDeljenja);
	}
}

