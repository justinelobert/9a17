var numb1= prompt("saisir premier numero", "entrez votre numéro");
var numb2= prompt("saisir deuxieme numero", "entrez votre numéro");
var op= prompt("sasir un opérateur");
var resultat;
switch(op){
        case"+":
  resultat=
      parseInt(numb1)+parseInt(numb2);
        alert(resultat);
        break;
        
        
        case"-":
        prompt(numb1-numb2);
        break;
        
        case"/":
        prompt(numb1/numb2);
        break;
        
        case"*":
        prompt(numb1*numb2);
        break;
        
    }