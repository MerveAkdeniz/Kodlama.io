
public class ÖðrenciManager extends KullanýcýManager{
	public void Kurs(Öðrenci öðrenci) {
		System.out.println(öðrenci.getId()+ " id li öðrenci " + öðrenci.getKurs() + " kursuna kayýtlýdýr.");
	}
public void öðrenmeAlaný(Öðrenci öðrenci) {
	System.out.println(öðrenci.getId()+ " id li öðrencinin öðrenme alaný: " + öðrenci.getÖðrenmeAlaný());
}
}
