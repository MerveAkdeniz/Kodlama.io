
public class Eğitmen extends Kullanıcı {
	private String sertifika;
	private String uzmanlıkAlanı;
	public Eğitmen(int id,String adı, String soyAdı, String sertifika,String uzmanlıkAlanı) {
		super(id,adı,soyAdı);
		this.sertifika=sertifika; 
		this.uzmanlıkAlanı=uzmanlıkAlanı;
	}
	public String getSertifika() {
		return sertifika;
	}
	public void setSertifika(String sertifika) {
		this.sertifika=sertifika;
	}
	public String getUzmanlıkAlanı() {
		return uzmanlıkAlanı;
	}
	public void setUzmanlıkAlanı(String uzmanlıkAlanı) {
		this.uzmanlıkAlanı=uzmanlıkAlanı;
	}
}
