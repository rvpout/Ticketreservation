package Main;
import java.io.*;
import java.util.ArrayList;

	/**
	 * Tehdään luokka mikä tallentaa asiakkaan syöttämät tiedot uuteen tekstitiedostoon.
	 * 
	 */

public class tallennaTxt {
	
	public void tallennaTxt(String varausTiedot, ArrayList<Asiakas> ihminen) {
		
		
		try {
			
	    File file = new File(varausTiedot);

	    if ( ! file.exists()) {
	        file.createNewFile();
	    }

	    FileWriter fw = new FileWriter(file.getAbsoluteFile());
	    BufferedWriter bw = new BufferedWriter(fw);
	    for(int i = 0; i < ihminen.size(); i++) {
	    	
	    	bw.write(ihminen.get(i).annaTiedot());
	    }
	    bw.close();
		}
		
	 catch(IOException e) {
		 
		 System.out.println("Error: " + e);
		 e.printStackTrace();
	}
	}
}
