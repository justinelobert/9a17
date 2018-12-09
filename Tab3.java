package tab3;

public class Tab3 {
}
	{ scanf("%d%*c",&choix);   
    switch(choix)
    {  
                 case 1 : 
                      printf("Saisie d un entier\n"); 
                      printf ("Veuillez saisir un entier\n"); 
                      scanf("%d%*c",&j); 
                      printf("L entier est : %d\n",j); 
                      break;   
                 case 2 : 
                      printf("Saisie d un caractere\n"); 
                      printf ("Veuillez saisir un caractere\n"); 
                      scanf("%c%*c",&car); 
                      printf("Le caractere est : %c\n", car); 
                      break;   
                 case 3 : 
                      printf("Au revoir\n");
                      // la tu peux mettre un getchar ou un systempause ou sinon tu mets rien...
                      fin=0;
                      break;
                      //La valeur de "fin" est bien modifiée ce qui permet de quitter le menu  fin=0; break;//
                 default: 
                      printf("Erreur de saisie-->Choix non valide!\n\a"); 
 
    } //Fin du switch   
 
    } //Fin du do   
    //Tant que l'on reste dans les choix possible  
    while(fin!=0);