
public class ��renci extends Kullan�c� {
private String kurs;
private String ��renmeAlan�;
public ��renci(int id,String ad�, String soyAd�, String kurs,String ��renmeAlan�) {
	super(id,ad�,soyAd�);
	this.kurs=kurs; 
	this.��renmeAlan�=��renmeAlan�;
}
public String getKurs() {
	return kurs;
}
public void setKurs(String kurs) {
	this.kurs=kurs;
}
public String get��renmeAlan�() {
	return ��renmeAlan�;
}
public void set��renmeAlan�(String ��renmeAlan�) {
	this.��renmeAlan�=��renmeAlan�;
}
}
