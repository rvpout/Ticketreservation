package Main;

	/** Tehdään luokka jossa määritellään asiakas,
	 *mitä tietoja asiakkaalta halutaan tallentaa
	 *
	 *@param muuttuja1 - Asiakkaan nimi.
	 *@param muuttuja2 - Asiakkaan ikä.
	 *@param muuttuja3 - Asiakkaan valitsema lippu.
	 *@param muuttuja4 - Asiakkaan varaamien lippujen määrä.
	 *
	 */

public class Asiakas {
	
	protected String nimi;
	protected int ika;
	protected int liput;
	protected int maara;
	
	public Asiakas(int maara, int liput ,String nimi, int ika) {
		this.nimi = nimi;
		this.ika = ika;
		this.liput = liput;
		this.maara = maara;
	}
	public void asetaMaara(int maara) {
		this.maara = maara;
	}
	
	public int annaMaara() {
		return maara;
	}
	
	public void asetaNimi(String nimi) {
		this.nimi = nimi;
	}
	
	public String annaNimi() {
		return nimi;
	}
	
	public void asetaIka(int ika) {
		this.ika = ika;
	}
	
	public int annaIka() {
		return ika;
	}
	
	public void asetaLiput(int liput) {
		this.liput = liput;
	}
	
	public int annaLiput() {
		return liput;
	}
	public String annaTiedot() {
	
		return  "Nimi:" + nimi + "," + "Ikä:" + ika + "," + "Valittu lippu:" + liput +"," + "Lippujen määrä:" + maara;
	}
	public void Varaaminen() {
		// TODO Auto-generated method stub
		
	}
	
	
}


