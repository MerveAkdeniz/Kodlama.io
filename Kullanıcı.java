
public class Kullan�c� {
	/*kullan�c� bilgilerini gizli metot ile yaz�yoruz.*/
	private int id;
	private String ad�;
	private String soyAd�;

	public Kullan�c�(int id, String ad�, String soyAd�) {
		super();
		this.id=id;
		this.ad�=ad�;
		this.soyAd�=soyAd�;
	}
	public int getId() {
		return id;
	}
	public void setId(int id ) {
		this.id=id;
	}
	public String getAd�() {
		return ad�;
	}
	public void setAd�(String ad� ) {
		this.ad�=ad�;
	} 
	public String getSoyAd�() {
		return soyAd�;
	}
	public void setSoyAd�(String soyAd� ) {
		this.soyAd�=soyAd�;
	}
}
