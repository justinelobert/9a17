package ex13;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {

		// 1.demander à un utilisateur de saisir une chaine de caractère
		/* 2.demander à cet utilisateur de saisir une lettre
		   3.calculez le nombre de fois où cette lettre est présente dans la 
		   chaine saisie en 1. */
		Scanner sc = new Scanner(System.in);
		System.out.println("saisir une chaine de caractère :");
		String phrase = sc.nextLine();
		System.out.println("Veuillez saisir une lettre :");
		String lettre = sc.nextLine();
		System.out.println("il y a tant de fois : " );
		int compteur=0;
		for(int i =0; i < phrase.length(); i++){
			if(phrase.charAt(i)== lettre.charAt(0)) {
				compteur++;
				System.out.println("ajout d'une lettre");

			}
		}
		System.out.println(compteur +"lettre"+lettre);
	}
}

