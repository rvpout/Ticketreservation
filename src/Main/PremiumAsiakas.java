package Main;

/**
 * 
 * @param muuttuja 5 - Tieto asiakkaan premium jäsenyydestä.
 * 
 * PremiumAsiakas perii Asiakas luokan tiedot,
 * Luokka eroaa asiakkaasta siten, että se lisää tiedon jos asiakas on premium jäsen.
 * 
 *
 */



public class PremiumAsiakas extends Asiakas {

	protected String VIP = "Premium asiakas";

	public PremiumAsiakas(int maara, int liput, String nimi, int ika, String VIP) {
		super(maara, liput, nimi, ika);
		this.VIP = VIP;
		
	}
	
	public void asetaVip(String VIP) {
		this.VIP = VIP;
	}
	
	public String annaVip() {
		return VIP;
	}
	
	public String annaTiedot() {
		
		return  "Nimi:" + nimi + "," + "Ikä:" + ika + "," + "Valittu lippu:" + liput +"," + "Lippujen määrä:" + maara + "," + VIP;
	}
	

}
