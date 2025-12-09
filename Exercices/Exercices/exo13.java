/* EXO13 : Avec PRINT & SCANNER : Convertir du centimètre (Entier) au mètre (Double)
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une taille en centimètre ?
 * 
 * 170
 * 
 * 170 cm vaut 1.70 m
 * 
 * 
 * 
 * 
*/
package Exercices;

import java.util.Scanner;

public class exo13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tailleCentimetre = 0;
        double tailleMettre;
        System.out.println("Donner une taille en centimètre ?");
        tailleCentimetre=sc.nextInt();
        double tailleCentimetre2=(double)tailleCentimetre;
        tailleMettre=tailleCentimetre2/100;
        System.out.println(tailleCentimetre+" cm vaut "+tailleMettre+" m");
        sc.close();
    }
}