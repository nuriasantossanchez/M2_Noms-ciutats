package fase1;

public class UtilsFase1 {
	
	private String strBarcelona;
	private String strMadrid;
	private String strValencia;
	private String strMalaga;
	private String strCadiz;
	private String strSantander;
	
	public UtilsFase1() {
		
	}

	public String getStrBarcelona() {
		return strBarcelona;
	}

	public void setStrBarcelona(String strBarcelona) {
		this.strBarcelona = strBarcelona;
	}

	public String getStrMadrid() {
		return strMadrid;
	}

	public void setStrMadrid(String strMadrid) {
		this.strMadrid = strMadrid;
	}

	public String getStrValencia() {
		return strValencia;
	}

	public void setStrValencia(String strValencia) {
		this.strValencia = strValencia;
	}

	public String getStrMalaga() {
		return strMalaga;
	}

	public void setStrMalaga(String strMalaga) {
		this.strMalaga = strMalaga;
	}

	public String getStrCadiz() {
		return strCadiz;
	}

	public void setStrCadiz(String strCadiz) {
		this.strCadiz = strCadiz;
	}

	public String getStrSantander() {
		return strSantander;
	}

	public void setStrSantander(String strSantander) {
		this.strSantander = strSantander;
	}
	
	public void printStringCiudades() {
		String separador=" - ";
		
		System.out.println();
		System.out.println("Nombre de ciudades...");
		System.out.println();
		
		System.out.println(this.getStrBarcelona().toUpperCase()+separador+this.getStrMadrid().toUpperCase()
				+separador+this.getStrValencia().toUpperCase()+separador+this.getStrMalaga().toUpperCase()
				+separador+this.getStrCadiz().toUpperCase()+separador+this.getStrSantander().toUpperCase());
		
	}

}
