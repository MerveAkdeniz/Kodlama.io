
public class E�itmen extends Kullan�c� {
	private String sertifika;
	private String uzmanl�kAlan�;
	public E�itmen(int id,String ad�, String soyAd�, String sertifika,String uzmanl�kAlan�) {
		super(id,ad�,soyAd�);
		this.sertifika=sertifika; 
		this.uzmanl�kAlan�=uzmanl�kAlan�;
	}
	public String getSertifika() {
		return sertifika;
	}
	public void setSertifika(String sertifika) {
		this.sertifika=sertifika;
	}
	public String getUzmanl�kAlan�() {
		return uzmanl�kAlan�;
	}
	public void setUzmanl�kAlan�(String uzmanl�kAlan�) {
		this.uzmanl�kAlan�=uzmanl�kAlan�;
	}
}
