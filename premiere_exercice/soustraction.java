package premiere_exercice;

import java.util.Scanner;

public class soustraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int add1, add2;
         //première entrer
        System.out.println("Entrer le premier nombre de la soustraction");
       
        add1=sc.nextInt();
         //deuxime entrer
        System.out.println("Entrer le deuxieme nombre de la soustraction");
        add2=sc.nextInt();
        int resultat=add1-add2;
        System.out.println("le résultat de la soustraction est "+resultat);
        sc.close();

    } 
}
