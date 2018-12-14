package exo12;

public class Ex {

	public static void main(String[] args) {

		// Déclarez une variable de type tableau de 5 entiers.
		/* Remplissez ce tableau avec des valeurs aléatoires comprises entre 0 et 10.
           Indiquez si la valeur 4 est dans le tableau, si oui indiquez sa 
           position.*/
		int tableauEntier[] = new int[5];

		for(int i = 0; i < tableauEntier.length; i++) {
			tableauEntier[i] = 0 + (int)(Math.random() * ((10 - 0) + 1)); // valeur aléatoire
			//affectation index
			System.out.println(tableauEntier[i]);	

		}

	}

}
