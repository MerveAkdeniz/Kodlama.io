
public class Main {

	public static void main(String[] args) {
		Kullanıcı kullanıcı = new Kullanıcı(5464684,"Merve","AKDENİZ");
        KullanıcıManager kullanıcıManager = new KullanıcıManager();
        kullanıcıManager.Add(kullanıcı);
        
        Öğrenci öğrenci = new Öğrenci(1546544,"Gizem", "ULUDAĞ","Java+React"," YAZILIM GELİŞTİRİCİ YETİŞTİRME");
	    ÖğrenciManager öğrenciManager = new ÖğrenciManager();
	    öğrenciManager.Kurs(öğrenci);
	    öğrenciManager.öğrenmeAlanı(öğrenci);
	    
	    Eğitmen eğitmen = new Eğitmen(4168464,"Engin","DEMİROĞ","Microsoft Certified Trainer(MCT) ,PMP ve ITIL "," YAZILIM GELİŞTİRME ");
	    EğitmenManager eğitmenManager = new EğitmenManager();
	    eğitmenManager.sertifika(eğitmen);
	    eğitmenManager.uzmanlıkAlanı(eğitmen);
	}

}
