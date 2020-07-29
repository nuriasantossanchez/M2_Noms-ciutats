package fase2;

import java.util.ArrayList;
import java.util.Collections;

public class UtilsFase2 {
	
	private ArrayList<String> arrayCiudades = new ArrayList<String>();

	public UtilsFase2() {
		
	}

	public ArrayList<String> getArrayCiudades() {
		return arrayCiudades;
	}
	

	public void setArrayCiudades(ArrayList<String> arrayCiudades) {
		this.arrayCiudades = arrayCiudades;
	}

	public void addStringAlArrayList(String strCiudad) {
		this.arrayCiudades.add(strCiudad);
	}
	
	public void printArrayListCiudades() {
		
		System.out.println();
		System.out.println("Nombre de ciudades ordenanadas alfabéticamente...");
		System.out.println();
		
		Collections.sort(this.getArrayCiudades());
		for(String s:this.getArrayCiudades()) {
			System.out.println(s);
		}
	}

	@Override
	public String toString() {
		return "[arrayCiudades=" + arrayCiudades + "]";
	}
	
	

}
