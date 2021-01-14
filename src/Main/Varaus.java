package Main;
import java.util.*;


	/**
	 * @author roope & Julius
	 * luokka varaus perii asiakas luokan,
	 * saadaan tallennettua asiakkaan infot asiakas listaan,
	 * parametreina Asiakas luokassa määritellyt arvot.
	 *
	 */

public class Varaus {

	public static void Varaaminen() {
		
		/**
		 * Ohjelma kysyy ensin minkä lipun 4 vaihtoehdosta haluaa, jonka jälkeen
		 * kuinka monta lippua asiakas haluaa
		 * Asiakkaan ikää ja nimeä, jonka jälkeen tallentaa tiedot ihminen listaan.
		 */
		
		ArrayList<Asiakas> ihminen = new ArrayList<Asiakas>();
		int lippujaJaljella = 20;
		
		
		/**
		 * 
		 * lippujaJaljella muuttuja on k�yt�ss� loopin takia.
		 * 
		 */
		
		
		for(int i = 0; i <= lippujaJaljella; i++) {
		
		
		System.out.println("Valitse haluamasi lippu:");
		System.out.println("Elokuva lippu, valitse 1");
		System.out.println("Lentokone lippu, valitse 2");
		System.out.println("Juna lippu, valitse 3");
		System.out.println("Teatteri lippu, valitse 4");
				
		Scanner tulostus = new Scanner(System.in);
		int liput = tulostus.nextInt();
		
		System.out.println("Valitse lippujen määrä:");
		Scanner Maara = new Scanner(System.in);
		
		int maara = Maara.nextInt();
		if(maara > 5) {
			System.out.println("Maksimi lippujen määrä on 5");
			System.out.println(" ");
		}
		else {
		lippujaJaljella = lippujaJaljella - maara;
		
		
		System.out.println("Nimi ja ikä kiitos!");
		System.out.println("Ikä:");
			
		Scanner Ika = new Scanner(System.in);
		int ika = Ika.nextInt();
		
		System.out.println("Nimi:");
				
		Scanner nim = new Scanner(System.in);
		String nimi = nim.nextLine();
		
		/**
		 * 
		 * Jos asiakas haluaa premium jäsenyyden hän valitsee numeron 1.
		 * Tällöin tietojen perään tallentuu tieto: "Premium asiakas".
		 * 
		 */
		
		
		System.out.println("Haluatko Vipin? Kyllä = 1 | Ei = 2");
		
		Scanner valinta = new Scanner(System.in);
		int val = valinta.nextInt();
		
		if (val == 1) {
			
			String VIP = "Premium Asiakas";
			Asiakas a = new PremiumAsiakas(maara,liput, nimi, ika, VIP);
			ihminen.add(a);
			
			System.out.println("Varaus on onnistunut! :)");
			System.out.println(" ");
			
			System.out.println("Näytä tallenetut tiedot antamalla 1 tai lopeta varaus antamalla 2");
	        Scanner Näytä = new Scanner(System.in);
	        int näytä = Näytä.nextInt();
			
			if(näytä == 1) {
	            ArrayList<String> tiedot = new ArrayList<String>();
	            tiedot.add("Nimi:" + nimi);
	            tiedot.add("Ikä:" + ika);
	            tiedot.add("Valittu lippu:" + liput);
	            tiedot.add("Lippujen määrä:" + maara);
	            tiedot.add(VIP);
	            

	            System.out.println(tiedot);

	            break;
	        }
	        else {

	            break;
	            

	        }
			
			/**
			 * 
			 * Jos asiakas valitsi numeron 2, eli ei halunnut premium jäsenyyttä,
			 * koodi jatkuu ihan normaalisti pelkästään Asiakas luokan tiedoilla.
			 * 
			 */
			
			
		}else {

		
		Asiakas asiakas = new Asiakas(maara, liput, nimi, ika);
		ihminen.add(asiakas);
		}
		
		
		System.out.println("Varaus on onnistunut! :)");
		System.out.println(" ");
		
		
		
		System.out.println("Näytä tallenetut tiedot antamalla 1 tai lopeta varaus antamalla 2");
        Scanner Näytä = new Scanner(System.in);
        int näytä = Näytä.nextInt();
		
		if(näytä == 1) {
            ArrayList<String> tiedot = new ArrayList<String>();
            tiedot.add("Nimi:" + nimi);
            tiedot.add("Ikä:" + ika);
            tiedot.add("Valittu lippu:" + liput);
            tiedot.add("Lippujen määrä:" + maara);
            

            System.out.println(tiedot);

            break;
        }
        else {

            break;

        }
		}
		
		}
		lippujaJaljella--;
		
		tallennaTxt t = new tallennaTxt();
		t.tallennaTxt("varaukset.txt", ihminen);
		
		
		
		
				
	}
	

	
}


