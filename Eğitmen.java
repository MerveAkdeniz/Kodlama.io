
public class Eðitmen extends Kullanýcý {
	private String sertifika;
	private String uzmanlýkAlaný;
	public Eðitmen(int id,String adý, String soyAdý, String sertifika,String uzmanlýkAlaný) {
		super(id,adý,soyAdý);
		this.sertifika=sertifika; 
		this.uzmanlýkAlaný=uzmanlýkAlaný;
	}
	public String getSertifika() {
		return sertifika;
	}
	public void setSertifika(String sertifika) {
		this.sertifika=sertifika;
	}
	public String getUzmanlýkAlaný() {
		return uzmanlýkAlaný;
	}
	public void setUzmanlýkAlaný(String uzmanlýkAlaný) {
		this.uzmanlýkAlaný=uzmanlýkAlaný;
	}
}
