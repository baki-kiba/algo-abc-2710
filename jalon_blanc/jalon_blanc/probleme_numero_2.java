package jalon_blanc;
/**
 * Problème n° 2 :

A l’aide Scanner et Print, me faire un algorithme qui vous permet de boire une bouteille (1L) jusqu’à ce qu’elle soit vide.
 Vous buvez la bouteille en une unité de centilitre, une fois le litre de la bouteille à 0, le programme s’arrête


Résultat attendu :

Vous avez 100cl dans votre bouteille, combien de centilitre vous voulez boire ? :

50

Vous avez bu 50cl. Il reste encore 50cl dans votre bouteille.

Vous avez 50cl dans votre bouteille, combien de centilitre vous voulez boire ? :

50

Vous avez bu 50cl. Votre bouteille est vide
 */
import java.util.Scanner;
public class probleme_numero_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bouteille=100;
        int boire = 0;
        System.out.println("Vous avez 100cl dans votre bouteille, combien de centilitre vous voulez boire ? :");

        while(!(bouteille==0)||bouteille<0){
           
        
            
        boire=sc.nextInt();
        bouteille=bouteille-boire;
        System.out.println("Vous avez bu "+boire);
        System.out.println("il vous reste "+bouteille);
        }

    
    }
}