
public class N {

}
import java.util.Scanner;


public static void main(String[] args) {

Scanner entree = new java.util.Scanner(System.in);

System.out.println("Entrez le montant que vous voulez retirer");
int m = entree.nextInt();
int x;
int y;
int z;
int i;
i= m%10;
if (m>=50){
do{
x = m/50;
System.out.println ("Vous allez recevoir "+x+" billets de 50 euros");
y= x/20;
System.out.println ("Vous allez recevoir "+y+" billets de 20 euros");
z= y/10;
System.out.println ("Vous allez recevoir "+z+" billets de 10 euros");
}
while (m==0);
}
else if (m<=20 && m>50){
do{
y= m/20;
System.out.println ("Vous allez recevoir "+y+" billets de 20 euros");
z= y/10;
System.out.println ("Vous allez recevoir "+z+" billets de 10 euros");
}
while (m==0);
}else{
do{
z= m/10;
System.out.println ("Vous allez recevoir "+z+" billets de 10 euros");
} while (m==0);
}

}

}