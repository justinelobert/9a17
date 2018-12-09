package table3;

public class table3 {

}
import java.util.Scanner;

public class TableMultiplication {

   public static void main(String[] args) {
	Scanner saisie=new Scanner(System.in);
	int choix=0, i;
	char reponse;
	do
	{
	   //affichage du menu
	   for(i=1; i<=10; i++)
	   System.out.println(i + " table de " + i);
	   //on demande à l'utilisateur de taper le nombre qu'il veut affiche
	   do
	   {
	      System.out.print("donnez votre choix ");
	      choix=saisie.nextInt();
	   }while(choix<1 || choix>10);
	   
           //on appelle la fonction en lui passant le nombre saisi par l'utilisateur comme argument
	   multiplication(choix);
	
	   //on demande à l'utilisateur s'il veut afficher la table d'un autre
	   do
	   {
	      System.out.print("voulez-vous afficher la table d'un autre nombre?(O/N)");
				
	      saisie.nextLine();
	      reponse=saisie.nextLine().toUpperCase().charAt(0);

				
	      if(reponse!='O' && reponse!='N')
		 System.out.println("Mauvais choix");

	   }while(reponse!='O' && reponse!='N'); //tant qu'il ne repond pas par O ou N on redemande

	}while(reponse=='O'); /*si la reponse est O on repète la boucle, donc l'utilsateur va 
             afficher une autre table sinon on sort de la boucle, on sort ainsi du proramme*/
   }

   static void multiplication(int choix)
   {
      System.out.println("Table de multiplication de" + choix);
	
      for(int i=1; i<=10; i++)
      System.out.println(i + " * " + choix + " = " + choix*i);
   }
}