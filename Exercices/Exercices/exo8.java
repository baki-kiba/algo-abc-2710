/* EXO8 : A l'aide de Scanner et Print, créer un formulaire d'inscription, où on vous demande de renseignez, votre prénom, votre nom, adresse email,
 *  mot de passe et confirmer votre mot de passe (ils doivent être identiques). Si les mots de passes ne sont pas identiques, ceci affiche "inscription annulée"
 * Sinon vous affichez le message suivant ci-dessous :
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
 * Votre adresse email ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * Votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * confirmer votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * Merci Eudes KONDA , votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : ekonda@arfp.asso.fr
 * 
*/
package Exercices;
import java.util.Scanner;

public class exo8 {
    public static void main(String[] args) {
        String prenom, nom, adresseMail, motDePasse, motDePasse2;
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
        sc.close();

    }
    

}