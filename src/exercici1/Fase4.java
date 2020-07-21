package exercici1;

public class Fase4 {

	public static void main(String[] args) {
		String nom = "Lluís";
		String cognom1 = "Sitjes";
		String cognom2 = "Gallart";
		String nom_complet = (nom + " " + cognom1 + " " +cognom2);
		int dia = 17;
		int mes = 6;
		int any = 1982;
		String data_complet = (dia + "/" + mes + "/" + any);
		boolean esBisiesto = false;
		int i;
		
		for (i=1948; i<=any; i = i+4) {
			if (any == i) {
				esBisiesto = true;
			} else if (any != i){
				esBisiesto = false;
			}
		}
		System.out.println("El meu nom és: " + nom_complet);
		System.out.println("Vaig néixer el " + data_complet);
		if (esBisiesto == true) {
			System.out.println("El meu any de naixement és de traspàs");
		} else {
			System.out.println("El meu any de naixement NO és de traspàs");
		}
		}

}
