
public class Main {

	public static void main(String[] args) {
		Kullan�c� kullan�c� = new Kullan�c�(5464684,"Merve","AKDEN�Z");
        Kullan�c�Manager kullan�c�Manager = new Kullan�c�Manager();
        kullan�c�Manager.Add(kullan�c�);
        
        ��renci ��renci = new ��renci(1546544,"Gizem", "ULUDA�","Java+React"," YAZILIM GEL��T�R�C� YET��T�RME");
	    ��renciManager ��renciManager = new ��renciManager();
	    ��renciManager.Kurs(��renci);
	    ��renciManager.��renmeAlan�(��renci);
	    
	    E�itmen e�itmen = new E�itmen(4168464,"Engin","DEM�RO�","Microsoft Certified Trainer(MCT) ,PMP ve ITIL "," YAZILIM GEL��T�RME ");
	    E�itmenManager e�itmenManager = new E�itmenManager();
	    e�itmenManager.sertifika(e�itmen);
	    e�itmenManager.uzmanl�kAlan�(e�itmen);
	}

}
