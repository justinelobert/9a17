package ex16;

import java.util.Scanner;

public class test 

{
	public static void main(String G[])

	//demandez la saisie d'un mot
	/*Déterminez si ce mot est un palindrome*/
	{
		Scanner x=new Scanner(System.in);

		System.out.println("Entrez le mot");
		String t=x.next();



		char[] tab; //déclaration

		tab=t.toCharArray(); //acces contenu tableau 


		int c=t.length()-1;

		int i=0;
		int j=c;



		{
			i++;
			j--;
		}

		if ((i<=j)&&(tab[i]==tab[j]))

			System.out.println("le mot:"+t+" est un palindrome");
		else
			System.out.println(" le mot:"+t+" n'est pas un palindrome");
	}
}