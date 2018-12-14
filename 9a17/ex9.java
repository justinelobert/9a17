
import java.util.Scanner;

public class age {
	public static void main (String [] args){
		// âge inférieur strictement à 20 ans,âge supérieur strictement à 40 ans,
		/* âge est compris entre
		   20 ans et 40 ans (20 ans et 40 ans y compris).
		   Le comptage est arrêté dès la saisie d’un centenaire. Le centenaire est compté.
           Donnez le programme java correspondant qui affiche les résultats.*/

		int age = 0; // temporaire et stock 

		int jeune = 0; // stocker nbr de jeune 

		int nbe = 0; // combien de saisie

		int moyen = 0;

		int vieux = 0;

		int centenaire = 0;

		int anom = 0;

		Scanner scan = new Scanner(System.in);
		while (nbe <= 5) { // tant que 
			nbe++;
			System.out.println("rentrer votre age" );
			age =scan.nextInt();
			if (age < 20) { //si

				jeune++; // ajoue 1 variable jeune
				
			}
			else if ( age >= 20 && age < 40){ //sinon si
				moyen++;
				
			}
			else if ( age >= 40 && age < 100 ) {
				vieux++;
				

			} else if ( age == 100) {
				nbe=6; // change la valeur de variable
				centenaire++;
			}
			else { // sinon 
				anom++;
			}
			System.out.println(jeune + " moins de 20 ans");
			System.out.println(jeune + " moins de 40 ans");
			System.out.println(jeune + " moins de 100 ans");
		}


	}
}

