/* EXO17 : Avec PRINT & SCANNER : 
 * 
 * Créer un algo qui calcule les dépenses moyenne (en euros, en France) en carburant d'une voiture en fonction 
 * du type de carburant sur une distance en km. 
 * 
 * On consomme 6.5l / 100km pour l'essence
 * On consomme 5.5l / 100km pour le gazole
 * 
 * Les prix des carburants sont sur ce lien : https://carbu.com/france/prixmoyens
 * 
 * carburant par id
 * 
 * Gazole (B7) = 0
 * 
 * Sans Plomb 95 = 1
 * 
 * Sans Plomb 98 (E5) = 2
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est le type de votre carburant ?
 * 
 * 0
 * 
 * Vous avez choisi : Gazole 
 * Quel est la distance à parcourir (en km) ?
 * 
 * 150
 * 
 * Pour 150 km, vous allez dépenser en moyenne 13.99€
 * 
 * /!\ ATTENTION : Le résultat doit être en décimal 2 chiffres après la virgules
 * 
 *méthode : (Carburant / Distance) × 100
*/
package Exercices;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exo17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        double sansplom95 = 1.727 ;
        double sansplom98=1.804;
        double gazole=1.645; 
        int distance;
        int typeGazole=0;
        int typeSansPlomb95=1;
        int typeSansPlomb98=2;
        int choixCarburant=4;
        double prixGazole;
        
        double prixSamplon98;
        double prixSamplon95;
        double consomationGazole=5.5;
        double consomationEssence=6.5;
        System.out.println("");
        System.out.println("Quel est le type de votre carburant ?");
        System.out.println("Gazole (B7) = 0");
        System.out.println("Sans Plomb 95 = 1");
        System.out.println("Sans Plomb 98 (E5) = 2");
        
        
        choixCarburant=sc.nextInt();
        switch (choixCarburant) {
            case 0:
                System.out.println("Vous avez choisi :  Gazole");
                 System.out.println("Quel est la distance à parcourir (en km) ?");
                distance=sc.nextInt();
                prixGazole= gazole/distance*100*consomationGazole;
                String prixGazolPrecis = df.format(prixGazole);
                System.out.println("Pour "+distance+" km, vous allez dépenser en moyenne "+prixGazolPrecis+"€");
                break;
            case 1:
                System.out.println("Vous avez choisi : Sans Plomb 95");
                 System.out.println("Quel est la distance à parcourir (en km) ?");
                distance=sc.nextInt();
                prixSamplon95=sansplom95/distance*100*consomationEssence;
                String prixSamplon95Precis = df.format(prixSamplon95);
                System.out.println("Pour "+distance+" km, vous allez dépenser en moyenne "+prixSamplon95Precis+"€");
                break;
            case 2:
                System.out.println("Vous avez choisi : Sans Plomb 98");
                 System.out.println("Quel est la distance à parcourir (en km) ?");
                distance=sc.nextInt();
                prixSamplon98=sansplom98/distance*100*consomationEssence;
                String prixSamplon98Precis = df.format(prixSamplon98);
                System.out.println("Pour "+distance+" km, vous allez dépenser en moyenne "+prixSamplon98Precis+"€");
                break;
            default:
                System.err.println("Vous avez pas choisie le bon carburant relancer l'aplication");
        }
                sc.close();
    }
        
        
        }



    