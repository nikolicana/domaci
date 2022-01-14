package d13_01_2022;

public class FacebookPost {
	
private	String imePrezimeObjavio;
private String imePrezimeGdeJe;
private String tekst;
private int brojLajkova;
private	int brojDeljenja;
	
	public FacebookPost(){
		

	}
	
	
	public FacebookPost(String imePrezimeObjavio,String imePrezimeGdeJe,String tekst){
		this.imePrezimeObjavio=imePrezimeObjavio;
		this.imePrezimeGdeJe=imePrezimeGdeJe;
		this.tekst=tekst;
	}
	
	
	public String getImePrezimeObjavio() {
		return this.imePrezimeObjavio;
	}
	public void setImePrezimeObjavio(String imePrezimeObjavio) {
		this.imePrezimeObjavio=imePrezimeObjavio;
	}
	
	public String getImePrezimeGdeJe() {
		return this.imePrezimeGdeJe;
	}
	public void setImePrezimeGdeJe(String imePrezimeGdeJe) {
		this.imePrezimeGdeJe=imePrezimeGdeJe;
	}
	
	public String getTekst() {
		return this.tekst;
	}
	public void setTekst(String tekst) {
		this.tekst=tekst;
	}
	public int getBrojLajkova() {
		return this.brojLajkova;
	}
	public int getBrojDeljenja() {
		return this.brojDeljenja;
	}
	
	
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





