import java.util.Scanner;

import fase1.UtilsFase1;
import fase2.UtilsFase2;
import fase3.UtilsFase3;
import fase4.UtilsFase4;

public class NomsCiutatsApp {

	public static void main(String[] args) {
		
		System.out.println("\n======================= Fase 1 =======================\n");
		
		UtilsFase1 utilsFase1=new UtilsFase1();
		
		System.out.println("Introduce los nombres de estas ciudades:");
		Scanner consoleIn = new Scanner(System.in);
		do {
			System.out.println("Introduce Barcelona");
			utilsFase1.setStrBarcelona(consoleIn.nextLine());
		}while(!utilsFase1.getStrBarcelona().equalsIgnoreCase("Barcelona"));
		
		do {
			System.out.println("Introduce Madrid");
			utilsFase1.setStrMadrid(consoleIn.nextLine());
		}while(!utilsFase1.getStrMadrid().equalsIgnoreCase("Madrid"));
		
		do {
			System.out.println("Introduce Valencia");
			utilsFase1.setStrValencia(consoleIn.nextLine());
		}while(!utilsFase1.getStrValencia().equalsIgnoreCase("Valencia"));
		
		do {
			System.out.println("Introduce Malaga");
			utilsFase1.setStrMalaga(consoleIn.nextLine());
		}while(!utilsFase1.getStrMalaga().equalsIgnoreCase("Malaga"));
		
		do {
			System.out.println("Introduce Cadiz");
			utilsFase1.setStrCadiz(consoleIn.nextLine());
		}while(!utilsFase1.getStrCadiz().equalsIgnoreCase("Cadiz"));
		
		do {
			System.out.println("Introduce Santander");
			utilsFase1.setStrSantander(consoleIn.nextLine());
		}while(!utilsFase1.getStrSantander().equalsIgnoreCase("Santander"));
		
		utilsFase1.printStringCiudades();
		
		System.out.println("\n======================= Fase 2 =======================\n");
		
		UtilsFase2 utilsFase2=new UtilsFase2();
		utilsFase2.addStringAlArrayList(utilsFase1.getStrBarcelona());
		utilsFase2.addStringAlArrayList(utilsFase1.getStrMadrid());
		utilsFase2.addStringAlArrayList(utilsFase1.getStrValencia());
		utilsFase2.addStringAlArrayList(utilsFase1.getStrMalaga());
		utilsFase2.addStringAlArrayList(utilsFase1.getStrCadiz());
		utilsFase2.addStringAlArrayList(utilsFase1.getStrSantander());
		
		utilsFase2.printArrayListCiudades();
		
		System.out.println();
		System.out.println(utilsFase2.toString());
		
		System.out.println("\n======================= Fase 3 =======================\n");
		
		UtilsFase3 utilsFase3 = new UtilsFase3();
		utilsFase3.cambiarVocalPorNumeroEnArrayList(utilsFase2.getArrayCiudades());
		utilsFase3.printArrayListCiudadesModificadas();
		
		System.out.println();
		System.out.println(utilsFase3.toString());
		
		System.out.println("\n======================= Fase 4 =======================\n");
		
		UtilsFase4 utilsFase4 = new UtilsFase4();
		utilsFase4.printReverseArray();

	}

}
