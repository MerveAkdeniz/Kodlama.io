
public class Öðrenci extends Kullanýcý {
private String kurs;
private String öðrenmeAlaný;
public Öðrenci(int id,String adý, String soyAdý, String kurs,String öðrenmeAlaný) {
	super(id,adý,soyAdý);
	this.kurs=kurs; 
	this.öðrenmeAlaný=öðrenmeAlaný;
}
public String getKurs() {
	return kurs;
}
public void setKurs(String kurs) {
	this.kurs=kurs;
}
public String getÖðrenmeAlaný() {
	return öðrenmeAlaný;
}
public void setÖðrenmeAlaný(String öðrenmeAlaný) {
	this.öðrenmeAlaný=öðrenmeAlaný;
}
}
