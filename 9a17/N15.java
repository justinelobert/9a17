package ex15;

import java.util.Scanner;

public class N15 {

	public static void main(String[] args) {
		
		//  Demandez la saisie d'un mot à l'utilisateur
		/*  Afficher les trois derniers caractères de ce mot
	Afficher ce mot sans les deux premier caractère et sans les trois 
	dernier caractères
    (NB : Gérez le cas où le mot n'est assez long )*/
		
		
		// à finir 
		
		
		Scanner sc = new Scanner(System.in);
		int x;
		String str;
		String str2 = null;
		System.out.println("saisir un mot");
		str = sc.nextLine();		
		x = str.length();
		if (x>3) { //x>3 si mot pas assez long 

			str2 = str.substring(str.length() -3); // str stock
			System.out.println("Vous avez saisi : " + str2);

		}
		else {
			System.out.println("mot trop petit");

		}
		//System.out.println(str.substring(2,str.length()-3));

	}
}




