package exo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exo6 {
	public class SommeNombres 
	{
		public SommeNombres()
			int n = 0;
			int entier;
			int m = 0;
			int somme = 0;
			System.out.println("Vous allez saisir deux nombre pour  calculer leur somme ");
	 
			boolean isEntier;
	 
			do { isEntier = true;
				  System.out.print("Veuillez saisir le premier   numero : ");
				  Scanner s = new Scanner(System.in);
				  try{
				      n = s.nextInt();
				     } catch (InputMismatchException e) 
				             {
				               System.out.println("La valeur saisie n'est pas un entier");
				               isEntier = false;
				             }
				} while (isEntier != true);
	 
			do { 
				 isEntier = true;
			     System.out.print("Veuillez saisir le deuxieme numero : ");
			     Scanner s = new Scanner(System.in);
			     try{
			         m = s.nextInt();
			        } catch (InputMismatchException e) 
			             {
			               System.out.println("La valeur saisie n'est pas un entier");
			               isEntier = false;
			             }
			   } while (isEntier != true);
	 
	 
	 
			somme = n+m;
			System.out.println(n+" + "+m+" = "+somme);
		}
	 
	 
	 
	}
}