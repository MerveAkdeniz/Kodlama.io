
public class Öğrenci extends Kullanıcı {
private String kurs;
private String öğrenmeAlanı;
public Öğrenci(int id,String adı, String soyAdı, String kurs,String öğrenmeAlanı) {
	super(id,adı,soyAdı);
	this.kurs=kurs; 
	this.öğrenmeAlanı=öğrenmeAlanı;
}
public String getKurs() {
	return kurs;
}
public void setKurs(String kurs) {
	this.kurs=kurs;
}
public String getÖğrenmeAlanı() {
	return öğrenmeAlanı;
}
public void setÖğrenmeAlanı(String öğrenmeAlanı) {
	this.öğrenmeAlanı=öğrenmeAlanı;
}
}
