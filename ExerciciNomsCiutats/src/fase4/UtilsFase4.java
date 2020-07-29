package fase4;

import java.util.Arrays;

public class UtilsFase4 {
	
	private String strBarcelona="Barcelona";
	private String strMadrid="Madrid";
	private String strValencia="Valencia";
	private String strMalaga="Malaga";
	private String strCadiz="Cadiz";
	private String strSantander="Santander";
	
	private char arrayCharBarcelona[]=new char[strBarcelona.length()];
	private char arrayCharMadrid[]=new char[strMadrid.length()];
	private char arrayCharValencia[]=new char[strValencia.length()];
	private char arrayCharMalaga[]=new char[strMalaga.length()];
	private char arrayCharCadiz[]=new char[strCadiz.length()];
	private char arrayCharSantander[]=new char[strSantander.length()];

	public UtilsFase4() {
		this.arrayCharBarcelona=strBarcelona.toCharArray();
		this.arrayCharMadrid=strMadrid.toCharArray();
		this.arrayCharValencia=strValencia.toCharArray();
		this.arrayCharMalaga=strMalaga.toCharArray();
		this.arrayCharCadiz=strCadiz.toCharArray();
		this.arrayCharSantander=strSantander.toCharArray();
		
	}

	public char[] getArrayCharBarcelona() {
		return arrayCharBarcelona;
	}

	public void setArrayCharBarcelona(char[] arrayCharBarcelona) {
		this.arrayCharBarcelona = arrayCharBarcelona;
	}

	public char[] getArrayCharMadrid() {
		return arrayCharMadrid;
	}

	public void setArrayCharMadrid(char[] arrayCharMadrid) {
		this.arrayCharMadrid = arrayCharMadrid;
	}

	public char[] getArrayCharValencia() {
		return arrayCharValencia;
	}

	public void setArrayCharValencia(char[] arrayCharValencia) {
		this.arrayCharValencia = arrayCharValencia;
	}

	public char[] getArrayCharMalaga() {
		return arrayCharMalaga;
	}

	public void setArrayCharMalaga(char[] arrayCharMalaga) {
		this.arrayCharMalaga = arrayCharMalaga;
	}

	public char[] getArrayCharCadiz() {
		return arrayCharCadiz;
	}

	public void setArrayCharCadiz(char[] arrayCharCadiz) {
		this.arrayCharCadiz = arrayCharCadiz;
	}

	public char[] getArrayCharSantander() {
		return arrayCharSantander;
	}

	public void setArrayCharSantander(char[] arrayCharSantander) {
		this.arrayCharSantander = arrayCharSantander;
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

	public char[] reverseArray(char[] arrayChar) {
		
		char[] arrayCharReverse=new char[arrayChar.length];
		
		for(int i=0,j=arrayChar.length-1;j>=0;j--,i++) {
			arrayCharReverse[i]=arrayChar[j];
		}
		return arrayCharReverse;
	}
	
	public void printReverseArray() {
		
		char reverseArrrayBcn[]=reverseArray(this.getArrayCharBarcelona());
		char reverseArrrayMadr[]=reverseArray(this.getArrayCharMadrid());
		char reverseArrrayVal[]=reverseArray(this.getArrayCharValencia());
		char reverseArrrayMala[]=reverseArray(this.getArrayCharMalaga());
		char reverseArrrayCad[]=reverseArray(this.getArrayCharCadiz());
		char reverseArrraySntndr[]=reverseArray(this.getArrayCharSantander());
		
		System.out.println();
		System.out.println("Nombre de ciudades invertido...");
		System.out.println();
		
		//printReverseArrayBcn
		for(int i=0;i<this.getArrayCharBarcelona().length;i++) {
			System.out.print(this.getArrayCharBarcelona()[i]);
		}
		System.out.print(" - ");
		for(int i=0;i<reverseArrrayBcn.length;i++) {
			System.out.print(reverseArrrayBcn[i]);
		}
		
		System.out.println();
		System.out.print(Arrays.toString(this.getArrayCharBarcelona())
				+" - "+ Arrays.toString(reverseArrrayBcn));
		System.out.println("\n");
		
		//printReverseArrrayMadr
		for(int i=0;i<this.getArrayCharMadrid().length;i++) {
			System.out.print(this.getArrayCharMadrid()[i]);
		}
		System.out.print(" - ");
		for(int i=0;i<reverseArrrayMadr.length;i++) {
			System.out.print(reverseArrrayMadr[i]);
		}
		
		System.out.println();
		System.out.print(Arrays.toString(this.getArrayCharMadrid())
				+" - "+ Arrays.toString(reverseArrrayMadr));
		System.out.println("\n");
		
		//printReverseArrrayVal
		for(int i=0;i<this.getArrayCharValencia().length;i++) {
			System.out.print(this.getArrayCharValencia()[i]);
		}
		System.out.print(" - ");
		for(int i=0;i<reverseArrrayVal.length;i++) {
			System.out.print(reverseArrrayVal[i]);
		}
		
		System.out.println();
		System.out.print(Arrays.toString(this.getArrayCharValencia())
				+" - "+ Arrays.toString(reverseArrrayVal));
		System.out.println("\n");
		
		//printReverseArrrayMala
		for(int i=0;i<this.getArrayCharMalaga().length;i++) {
			System.out.print(this.getArrayCharMalaga()[i]);
		}
		System.out.print(" - ");
		for(int i=0;i<reverseArrrayMala.length;i++) {
			System.out.print(reverseArrrayMala[i]);
		}
		
		System.out.println();
		System.out.print(Arrays.toString(this.getArrayCharMalaga())
				+" - "+ Arrays.toString(reverseArrrayMala));
		System.out.println("\n");
		
		//printReverseArrrayCad
		for(int i=0;i<this.getArrayCharCadiz().length;i++) {
			System.out.print(this.getArrayCharCadiz()[i]);
		}
		System.out.print(" - ");
		for(int i=0;i<reverseArrrayCad.length;i++) {
			System.out.print(reverseArrrayCad[i]);
		}
		
		System.out.println();
		System.out.print(Arrays.toString(this.getArrayCharCadiz())
				+" - "+ Arrays.toString(reverseArrrayCad));
		System.out.println("\n");
		
		//printReverseArrraySntndr
		for(int i=0;i<this.getArrayCharSantander().length;i++) {
			System.out.print(this.getArrayCharSantander()[i]);
		}
		System.out.print(" - ");
		for(int i=0;i<reverseArrraySntndr.length;i++) {
			System.out.print(reverseArrraySntndr[i]);
		}
		
		System.out.println();
		System.out.print(Arrays.toString(this.getArrayCharSantander())
				+" - "+ Arrays.toString(reverseArrraySntndr));
		System.out.println("\n");
		
	}

	
}
