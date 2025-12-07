/* EXO9 : La suite de l'EXO 8, une fois l'inscription terminé, essayez de vous connecter en donnant l'email et le mot de passe correspondant.
 * 
 * Si l'email ou le mot de passe n'est pas bon, vous affichez "connexion refusée"
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prénom ?
 * 
 * Eudes
 * 
 * Votre nom ?
 * 
 * Konda
 * 
 * Votre adresse ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * confirmer votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * Merci Eudes KONDA , votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : ekonda@arfp.asso.fr
 * 
 * Pour vous connecter, renseignez votre email ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * Renseignez votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * 
 * 
*/
package Exercices;
import java.util.Scanner;

public class exo9 {
    public static void main(String[] args) {
        String prenom, nom, adresseMail, motDePasse, motDePasse2, adresseMail2,motDePasse3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Votre prénom ?");
        prenom =sc.nextLine();
        System.out.println("Votre nom ?");
        nom =sc.nextLine();
        System.out.println("Votre adresse mail ?");
        adresseMail =sc.nextLine();
        System.out.println("Votre mot de passe");
        motDePasse=sc.nextLine();
        System.out.println("Confirmer votre mot de passe ?");
        motDePasse2=sc.nextLine();
       while(!motDePasse.equals(motDePasse2)) {
                System.out.println("le mot de passe est invalid");
                System.out.println("retaper votre mot de passe ?");
                motDePasse=sc.nextLine();
                System.out.println("Confirmer votre mot de passe ?");
                motDePasse2=sc.nextLine();
        }
    
             {
            System.out.println("Merci "+prenom+" "+nom+" votre inscription a bien été effectuée recevrez un mail de confirmation à l'adresse : "+adresseMail);
            
    }
            System.out.println("Pour vous connecter, renseignez votre email");
            adresseMail2 =sc.nextLine();
            System.out.println("Renseignez votre mot de passe");
            motDePasse3=sc.nextLine();
                    
                while(!motDePasse2.equals(motDePasse3)|| !adresseMail.equals(adresseMail2)) {
                System.out.println("le mot de passe est invalid ou le mail est invalid");
                System.out.println("Quel est votre adresse mail ?\" ?");
                    adresseMail2=sc.nextLine();
                    System.out.println("Quel est votre mot de passe ?");
                    motDePasse2=sc.nextLine();
            }
            
                            {
                    System.out.println("Merci "+prenom+" "+nom+" vous ete conecter"+adresseMail);
                    
            }

            
            }
            

}