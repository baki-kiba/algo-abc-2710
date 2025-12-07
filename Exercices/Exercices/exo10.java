/* EXO10 : Créer un quizz de 5 questions, chaque question à deux réponses au choix VRAI OU FAUX, à chaque fois que vous répondez juste à une question vous gagnez un point
 * 
 * Après avoir répondez à vos 5 questions, vous avez le résultat final sur 5.
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Question 1 : L'informatique a besoin des mathématiques ? (V/F)
 * 
 * V
 * 
 * Question 2 : L'Algèbre de Boole a été inventé par Steve Jobs ? (V/F)
 * 
 * F
 * 
 * Question 3 : En numération, la base de 10 va de 0 à 10 ? (V/F)
 * 
 * F
 * 
 * Question 4 : Une table de vérité retourne l'expression algébrique (V/F)
 * 
 * V
 * 
 * Question 5 : Git permet de stocker à distance son travail (V/F)
 * 
 * 
 * V
 * 
 * 
 * Résultat du QUIZZ, vous avez 5 point(s) / 5
 * 
*/
package Exercices;

import java.util.Scanner;

public class exo10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reponse1, reponse2,reponse3,reponse4,reponse5;
        int conter=0;
        System.out.println("Question 1 : L'informatique a besoin des mathématiques ? (V/F)");
        reponse1=sc.nextLine();
        System.out.println("Question 2 : L'Algèbre de Boole a été inventé par Steve Jobs ? (V/F)");
        reponse2=sc.nextLine();
        System.out.println("Question 3 : En numération, la base de 10 va de 0 à 10 ? (V/F)");
        reponse3=sc.nextLine();
        System.out.println("Question 4 : Une table de vérité retourne l'expression algébrique (V/F)");
        reponse4=sc.nextLine();
        System.out.println("Question 5 : Git permet de stocker à distance son travail (V/F)");
        reponse5=sc.nextLine();
        
        if (reponse1.equals("V")|| reponse1.equals("v")){
            conter++;
        }
          if (reponse2.equals("F")|| reponse2.equals("f")){
            conter++;
        }
          if (reponse3.equals("V")|| reponse3.equals("v")){
            conter++;
        }
          if (reponse4.equals("V")|| reponse4.equals("v")){
            conter++;
        }
          if (reponse5.equals("V")|| reponse5.equals("v")){
            conter++;
        }
        
            System.out.println("Résultat du QUIZZ, vous avez "+conter+" point(s) / 5");

        

    }
}


