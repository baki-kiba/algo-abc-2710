/* EXO15 : Avec PRINT & SCANNER : Me créer un convertisseur de devise, Euros , Dollars et Livres Sterling
 * 
 * Vous devriez choisir votre devise en entrée et la devise en sortie
 * 
 * Attention on ne peut pas convertir les deux même devise !
 * 
 * EUR : Euros
 * USD : Dollars
 * GBP : Livres Sterling
 * 
 * le lien ci-dessous vous donne la valeur des monnaies : https://www.boursorama.com/bourse/devises
 * 
 * ATTENTION ! : Montants doivent être décimaux , 2 chiffres après la virgule.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Quel est votre monnaie ?
 * 
 * EUR
 * 
 * Quel est votre montant ?
 * 
 * 100.00
 * 
 * Vous voulez la convertir en quelle devise ?
 * 
 * USD
 * 
 * Résultat : 113,82 USD
 * 
 * 
*/
package Exercices;

import java.util.Scanner;

public class exo15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double monnaie;
        double montant;
        double EUR ;
        double USD;
        double GPB;
        double dollarsToEur= 0.8593	;
        double dollarToLvre;
        double livresSterlingTOeur =1.1447;	
        double livretoDollar;
        System.out.println("Quel est votre monnaie ?");
        monnaie=sc.nextDouble();
        System.out.println("Quel est votre montant ?");
        montant=sc.nextDouble();
        
        
    }
}