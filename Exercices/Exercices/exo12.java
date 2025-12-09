/* EXO12 : Avec PRINT & Scanner , vous allez me créer un algo 
 * qui applique une réduction (en pourcentage %) sur un prix (en décimal) donnée :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prix ?
 * 
 * 100.00
 * 
 * Votre réduction (en pourcentage %) ?
 * 
 * 20
 * 
 * 
 * Prix après réduction de 20% :
 * 
 * 80.00
 * 
 * 
 * 
*/
package Exercices;

import java.util.Scanner;

public class exo12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prix, reduction,total;
        
        System.out.println("Votre prix ?");
        prix =sc.nextInt();
        System.out.println("Votre réduction (en pourcentage %) ?");
        reduction =sc.nextInt();
        total=((prix*reduction)/100-prix);
        total=total*-1;
        System.out.println("Prix après réduction de "+reduction+"%");
        System.out.println(+total);

        System.out.println();
        
        sc.close();
    }
}