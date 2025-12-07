/* EXO6 : A l'aide de Scanner et Print, donnez moi votre prénom et votre âge, pour l'affichage sous la forme d'une phrase dynamique
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * prenom = "Eudes"
 * 
 * age = 32
 * 
 * Je m'appelle Eudes , j'ai 32 ans
 * 
 * 
 * 
*/
package Exercices;
import java.util.Scanner;

public class exo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nom;
        String prenom;
        int age;
        System.out.println("Quel est votre prenom");
        prenom=sc.nextLine();
        System.out.println("Quel est votre nom");
        nom=sc.nextLine();
        System.out.println("quel est votre age");
        age=sc.nextInt();
        System.out.println("Vous vous apelez "+prenom+" "+nom+" et vous avez "+age);
        sc.close();
    }
}
