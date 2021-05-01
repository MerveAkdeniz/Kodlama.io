
public class Kullanýcý {
	/*kullanýcý bilgilerini gizli metot ile yazýyoruz.*/
	private int id;
	private String adý;
	private String soyAdý;

	public Kullanýcý(int id, String adý, String soyAdý) {
		super();
		this.id=id;
		this.adý=adý;
		this.soyAdý=soyAdý;
	}
	public int getId() {
		return id;
	}
	public void setId(int id ) {
		this.id=id;
	}
	public String getAdý() {
		return adý;
	}
	public void setAdý(String adý ) {
		this.adý=adý;
	} 
	public String getSoyAdý() {
		return soyAdý;
	}
	public void setSoyAdý(String soyAdý ) {
		this.soyAdý=soyAdý;
	}
}
