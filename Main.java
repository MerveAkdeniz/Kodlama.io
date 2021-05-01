
public class Main {

	public static void main(String[] args) {
		Kullanýcý kullanýcý = new Kullanýcý(5464684,"Merve","AKDENÝZ");
        KullanýcýManager kullanýcýManager = new KullanýcýManager();
        kullanýcýManager.Add(kullanýcý);
        
        Öðrenci öðrenci = new Öðrenci(1546544,"Gizem", "ULUDAÐ","Java+React"," YAZILIM GELÝÞTÝRÝCÝ YETÝÞTÝRME");
	    ÖðrenciManager öðrenciManager = new ÖðrenciManager();
	    öðrenciManager.Kurs(öðrenci);
	    öðrenciManager.öðrenmeAlaný(öðrenci);
	    
	    Eðitmen eðitmen = new Eðitmen(4168464,"Engin","DEMÝROÐ","Microsoft Certified Trainer(MCT) ,PMP ve ITIL "," YAZILIM GELÝÞTÝRME ");
	    EðitmenManager eðitmenManager = new EðitmenManager();
	    eðitmenManager.sertifika(eðitmen);
	    eðitmenManager.uzmanlýkAlaný(eðitmen);
	}

}
