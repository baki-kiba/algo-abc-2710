/* EXO7 : A l'aide de Scanner et Print, créer un questionnaire, "Do you speak english ?", répondre yes ou no, puis retourner le messages suivants 
 * 
 * si FALSE "So learn english !"
 * 
 * Si TRUE "Nice to meet you"
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Do you speak english (Y/N)?
 * 
 * Y (Tapez Y)
 * 
 * "Nice to meet you"
 * 
 * 
 * 
*/
package Exercices;
import java.util.Scanner;

public class exo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reponse;
        String messfalse="So learn english";
        String messtrue="Nice to meet you";
        System.out.println("Do you speak English");
        reponse =sc.nextLine();
        if(reponse.equals("no")){
            System.out.println(messfalse);
        }
        else if(reponse.equals("yes")){
            System.out.println(messtrue);
        }

        sc.close();

    }
    
}
