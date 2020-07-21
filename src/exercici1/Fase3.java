package exercici1;

public class Fase3 {

	public static void main(String[] args) {
		int i;
		int any_naix = 1982;
		boolean esBisiesto = false;
		String resultat_si = "L'any introduït és un any de traspàs.";
		String resultat_no = "L'any introduït NO és un any de traspàs.";
		
		for (i=1948; i<=any_naix; i = i+4) {
			if (any_naix == i) {
				esBisiesto = true;
			} else if (any_naix != i){
				esBisiesto = false;
			}
		}
		if (esBisiesto == true) {
			System.out.println(resultat_si);
		} else {
			System.out.println(resultat_no);
		}
	}

}
