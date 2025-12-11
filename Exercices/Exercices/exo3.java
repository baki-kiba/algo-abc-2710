/* EXO3 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition (types entiers) et vérifier si elle est pair ou impaire     
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resultat = 5
 * 
 * resultat est impaire
 * 
 * 
 * 
*/
package Exercices;
import java.util.Scanner;
public class exo3{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int isPaireImpaire;
        boolean isPairBool=false;
        while(!isPairBool){
        try{
        System.out.println("Entrer le premier à tester");
        isPaireImpaire=sc.nextInt();
            if (isPaireImpaire%2==0){
            System.out.println("L'entrer est paire");
        }
        else
        {
            System.out.println("L'entrer est impaire");
        }
        isPairBool=true;
    }
        catch (java.util.InputMismatchException e) {
        System.out.println("Erreur: au moins une saisie n'est pas un entier !");
        sc.nextLine();}

        }
        sc.close();

    }
}