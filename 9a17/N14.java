package exo14;

import java.util.Scanner;

public class N14 {

	public static void main(String[] args) {
		
		// 1.demander à un utilisateur de saisir une chaine de caractère
		/* 2.retournez cette chaine en majuscule
		   3.retournez cette chaine avec la première lettre en majuscule */
		Scanner sc = new Scanner(System.in);
		System.out.println("saisir une chaine de caractère :");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi : " + str);
		System.out.println(str.toUpperCase());

		String uppCase="";
		Scanner lineScan = new Scanner(str);
		while(lineScan.hasNext())
		{
			String up = lineScan.next();
			uppCase = Character.toUpperCase(up.charAt(0)) + up.substring(1) +"";
		}
		System.out.println(uppCase.trim());
	}




	//char[] char_table = str.toCharArray();
	/*char_table[0]=Character.toUpperCase(char_table[0]);
		chaine = new String(char_table);*/
}


