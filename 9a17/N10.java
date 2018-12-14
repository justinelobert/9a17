package ex10;

public class N10 {
	public static void main (String [] args){
		
		// Déclarez et initialisez une variable tab1 de type tableau 
		/* contenant les 4 éléments suivants : 4, 67, 25, 87.

   Déclarez et initialisez une variable tab2 de type tableau 
   contenant les 4 éléments suivants : 4.5, 67, 25.50, 87.00

   Déclarez et initialisez une variable tab3 de type tableau 
   contenant les 4 éléments suivant : 'r', '2', '?' , '+'.

   Déclarez et initialisez une variable tab4 de type tableau 
   contenant les 4 éléments suivant : 
   "Robert","Noemie", "David" , "Bertrand".

   Affichez le premier élément de tab1
   Remplacez la valeur de tab1 qui vaut 25 par la valeur 42.
   Afficher via une boucle for , toutes les valeurs de tab3.
   Affichez la taille de tab1 */

		int tab1 [] = { 4,67,25,87}; 
		double tab2 []= {4.5,67,25.50,87.00}; 
		char tab3 []= {'r','2','?','+'};
		String tab4[]= {"Robert","Noemie","David","Bertard"};
		System.out.println(tab1[2]);// afficher le 1 element de tab1
		tab1[2]=42; // changer la variable
		System.out.println(tab1[2]);
		for(int i = 0; i < tab3.length; i++) {
			System.out.println(tab3[i]); //afficher toutes les valeurs de tab3 avec i
		}
		System.out.println(tab1.length);
	}

}