
public class ��renciManager extends Kullan�c�Manager{
	public void Kurs(��renci ��renci) {
		System.out.println(��renci.getId()+ " id li ��renci " + ��renci.getKurs() + " kursuna kay�tl�d�r.");
	}
public void ��renmeAlan�(��renci ��renci) {
	System.out.println(��renci.getId()+ " id li ��rencinin ��renme alan�: " + ��renci.get��renmeAlan�());
}
}
