
public class E�itmenManager extends Kullan�c�Manager{
public void sertifika(E�itmen e�itmen) {
	System.out.println(e�itmen.getId()+" id li e�itmen "+ e�itmen.getSertifika()+ " sertifikas�na sahiptiri");
}
public void uzmanl�kAlan�(E�itmen e�itmen) {
	System.out.println(e�itmen.getId()+" id li e�itmenin uzmanl�k alan�: "+ e�itmen.getUzmanl�kAlan�());
}
}
