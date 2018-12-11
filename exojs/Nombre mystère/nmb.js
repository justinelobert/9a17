function nb_aleatoire(min, max)
{
     var nb = min + (max-min+1)*Math.random();
     return Math.floor(nb);
}
function nb_aleatoire(min, max)
{
     var nb = min + (max-min+1)*Math.random();
     return Math.floor(nb);
}
var de = nb_aleatoire(1, 6);
alert("Vous lancez un dé et obtenez " + de);
var nb = nb_aleatoire(0, 9);  // nb a deviner
var cpt = 3;    // nb de coups
var saisie;
var msg = 'Le nombre à deviner est compris entre 0 et 9.';

do
{
     saisie = prompt(msg);
     cpt++;
     // message a afficher au prochain tour :
     if(saisie > nb)
          msg = "C'est moins";
     else
          msg = "C'est plus";
}
while(saisie != nb);

alert("Bravo, tu as gagne en " + cpt + " coups !");
function PoM_manche(min, max)
{
     var nb = nb_aleatoire(min, max);
     var cpt = 0;
     var saisie;
     var msg = 'Le nombre a deviner est compris entre ' + min + ' et ' + max + '.';

     do
     {
          saisie = prompt(msg);
          cpt++;
          if(saisie > nb)
               msg = "C'est moins";
          else
               msg = "C'est plus";
     }
     while(saisie != nb);

     return cpt;
}
