package fase3;

import java.util.ArrayList;
import java.util.Collections;

public class UtilsFase3 {
	
	private ArrayList<String> arrayCiudadesModificadas = new ArrayList<String>();

	public UtilsFase3() {
		
	}

	public ArrayList<String> getArrayCiudadesModificadas() {
		return arrayCiudadesModificadas;
	}

	public void setArrayCiudadesModificadas(ArrayList<String> arrayCiudadesModificadas) {
		this.arrayCiudadesModificadas = arrayCiudadesModificadas;
	}
	
	public ArrayList<String> cambiarVocalPorNumeroEnArrayList(ArrayList<String> arrayCiudades) {
		char vocal='a';
		char number = Integer.toString(4).charAt(0);
		
		for(String s:arrayCiudades) {
			s=s.replace(vocal, (char) number);
			this.getArrayCiudadesModificadas().add(s);
		}
		this.setArrayCiudadesModificadas(this.getArrayCiudadesModificadas());
		return this.getArrayCiudadesModificadas();
		
	}
	
	public void printArrayListCiudadesModificadas() {
		
		System.out.println();
		System.out.println("Nombre de ciudades modificado ordenanadas alfabéticamente...");
		System.out.println();
		
		Collections.sort(this.getArrayCiudadesModificadas());
		for(String s:this.getArrayCiudadesModificadas()) {
			System.out.println(s);
		}
		
	}
	
	@Override
	public String toString() {
		return "[arrayCiudadesModificadas=" + arrayCiudadesModificadas + "]";
	}

}
