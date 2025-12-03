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
package premiere_exercice;
import java.util.Scanner;

public class learnEnglish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reponse;
        String no= "no";
        String yes= "yes";
        System.out.println("Do you speak English");
        reponse =sc.nextLine();
        if(reponse==no || reponse !=yes){
            System.out.println("So learn english");
        }
        if(reponse==yes|| reponse!=no){
            System.out.println("Nice to meet you");
        }
       
        sc.close();

    }
    
}
