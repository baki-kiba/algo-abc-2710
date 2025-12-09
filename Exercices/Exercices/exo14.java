/* EXO14 : Avec PRINT & SCANNER : Tester l'expression algèbrique booléenne A OU B ET NON C
 * 
 * A , B ou C sont des booléens et ne peuvent être qu'égale à TRUE ou FALSE.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une valeur A OU B ET NON C
 * 
 * FALSE
 * TRUE
 * FALSE
 * 
 * Résultat : TRUE
 * 
 * 
*/package Exercices;

import java.util.Scanner;

public class exo14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean resultat;
        boolean a ;
        boolean b ;
        boolean c ;

        System.out.println("donnée la valeur de a");
        a=sc.nextBoolean();
        System.out.println("donnée la valeur de b");
        b=sc.nextBoolean();
        System.out.println("donnée la valeur de c");
        c=sc.nextBoolean();
        resultat=a||b&&!c;
        System.out.println(resultat);
        

    }
}