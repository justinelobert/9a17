package exo8;

import java.util.Scanner;

public class nouv {
int i =1;
int count= 0;
int age =1;


Scanner sc = new Scanner (System.in);{

while(i<=20) {
    System.out.println("age");
    age = sc.nextInt();
    if (age <=20) {
        count++;
    }
i++;
}

   System.out.println(count + " moins de 20 ans");
}
}