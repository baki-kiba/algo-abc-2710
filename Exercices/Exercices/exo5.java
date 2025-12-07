/* EXO5 : A l'aide de Scanner et Print, créer une équation  A multiplier par B diviser par C (tous types entiers) , récupérer le résultat et vérifier si elle inférieur ou supérieur à 10
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * equation = (EQUATION)
 * 
 * equation = 15
 * 
 * 
 * equation est superieur
 * 
*/
package Exercices;
import java.util.Scanner;
public class exo5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b,c ;
        System.out.println("entre le chiffre a");
        a=sc.nextInt();
        b=sc.nextInt();
        b=sc.nextInt(); 
        int resultatEquation=a*b/b;
        if (resultatEquation<10){
            System.out.println("le resultat est strictement superieur à 10");
        }
        else{
            System.out.println("le resultat est strictement inferieur à 10");
        }
        sc.close();
    }
}
