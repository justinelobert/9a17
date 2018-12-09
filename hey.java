package exo;

import java.util.Scanner;

public class hey {
public static void main (String[]arg) {
	
	Scanner in = new Scanner (System.in);
	double res = 0;
	System.out.println ("Entrez un nombre entier");
	int x =in.nextInt();
	System.out.println ("Entrez un nombre entier");
	int y = in.nextInt();
	in.nextLine();
	System.out.println ("Entrez un symbole(+/*-)");
	String symbole = in.nextLine();
		if (( x >= -1000) && (y >= -1000) && (x <= 1000) && (y <= 1000)) {
			switch (symbole) {
			case "+": 
			System.out.println(x+y);
			break;
			case"*": 
				System.out.println(x*y);
			break;
			case"-": 
				System.out.println(x-y);
			break;
			case "/": 
			if ((x !=0) && (y !=0)) {
				System.out.println(x/y);
			}
				else{
			System.out.println("impossible !");
				}
			break;
			default:
				System.out.println("Erreur de symbole ");
				System.out.println(x+y);
			break;
			}
		}else {
		System.out.println("erreur! nombre trop grand");
		}
		
		
		
} 

}

