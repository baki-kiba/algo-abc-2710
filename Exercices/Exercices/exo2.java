/* EXO2 : A l'aide de Scanner et Print, me faire afficher le résultat d'une soustraction (types entiers) et vérifier si elle est inférieur à 0    
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a - b
 * 
 * resultat = -1
 * 
 * resutat est inférieur à 0
 * 
 * 
 * 
 */
package Exercices;
import java.util.Scanner;
public class exo2 {
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
