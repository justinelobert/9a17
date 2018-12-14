package ex17;

import java.util.Scanner;

public class newtest17 {

	public static int checkLetterInside(String str, String entree) {

		//CONDITION !!

		// j'analyse char par char la string
		char[] tab_entree = entree.toCharArray(); 
		// toCharArray = convertir un tableau de chaînes de caractères.
		char[] tab_str = str.toCharArray();
		// length renvoie la longueur d'une chaîne de caractères
		if (entree.length() == 1) {
			for(int j=0; j<str.length(); j++)
				// if exécuté que si la condition est remplie
				if(tab_str[j] == tab_entree[0])
					// return = C'est elle qui effectue le renvoi de la valeur
					return(3);
		}
		System.out.println("La lettre : '" + entree + "' n'est pas presente dans le mot");
		// return = C'est elle qui effectue le renvoi de la valeur
		return(2);
	}





	public static String checkLetter(String str, String etoiles, String entree) {

		//CONDITION 2 !!

		// j'analyse char par char la string
		char[] tab_entree = entree.toCharArray();
		// toCharArray = convertir un tableau de chaînes de caractères.
		char[] tab_str = str.toCharArray();
		// length renvoie la longueur d'une chaîne de caractères		
		if (entree.length() == 1) {
			char[] tab_etoiles = etoiles.toCharArray();
			for(int j=0; j<str.length(); j++)
				// if exécuté que si la condition est remplie
				if(tab_str[j] == tab_entree[0])
					tab_etoiles[j] = tab_entree[0];
			// vaueOf = Retourner un caractère instance représentant spécifiquement 
			/*  la valeur char.*/
			return(String.valueOf(tab_etoiles));
		} else {
			// je déclare ma variable 
			int count = 0;
			for(int j=0; j<str.length(); j++)
				// if exécuté que si la condition est remplie
				if(tab_str[j] == tab_entree[j])
					count++;
			if (count == str.length()) 
				// return = C'est elle qui effectue le renvoi de la valeur
				return(str);
		}
		// return = C'est elle qui effectue le renvoi de la valeur
		return(etoiles);
	}



	public static int checkEnd(String str) {
		int count = 0;
		// j'analyse char par char la string
		// toCharArray = convertir un tableau de chaînes de caractères.
		char[] tab = str.toCharArray();
		for(int j=0; j<str.length(); j++)
			if(tab[j] == '*') // je remplace lettres par *
				count ++;
		if(count == 0)
			// return = C'est elle qui effectue le renvoi de la valeur
			return(1);
		else
			// return = C'est elle qui effectue le renvoi de la valeur
			return(0);
	}



	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = ""; // execution 
		for (int i=0; i < 1;) {

			// l'utilisateur saisi un mot
			System.out.println("Veuillez saisir un mot :");
			str = sc.nextLine();
			// ici condition mot <= a 10 lettres 
			if (str.length() >= 2 && str.length() <= 10) 
				i = 2;
		}
		// l'utilisateur saisi un mot + str 
		System.out.println("Vous avez saisi le mot : " + str);
		String etoiles = str;

		char[] tab = etoiles.toCharArray();
		for(int j=0; j<str.length(); j++)
			tab[j] = '*';// je remplace lettres par *
		etoiles = String.valueOf(tab);
		System.out.println(etoiles);

		int restrict = 0;
		// Une boucle commence par une déclaration 
		/*  while = teste la condition et ensuite incrémente la variable */	
		while(restrict < 10 && checkEnd(etoiles) == 0) {
			String entree = "";
			for (int i=0; i < 1;) {
				System.out.println("Veuillez saisir une lettre ou un mot :");
				entree = sc.nextLine();
				System.out.println("Vous avez saisi : " + entree);
				i = checkLetterInside(str, entree);
				if (i == 2)
					restrict++;
			}
			etoiles = checkLetter(str, etoiles, entree);
			System.out.println("Rappel: mot a chercher : " + etoiles);
		}
		if (restrict == 10)
			System.out.println("Vous avez perdu, le mot etait : " + str);
		else
			System.out.println("Felicitations vous avez trouve le mot  " + str);
	}
}
