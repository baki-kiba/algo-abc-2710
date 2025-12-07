/* EXO4 : A l'aide de Scanner et Print, tester si une valeur(type entier) est divisible par 2   
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 14
 * 
 * 
 * a est bien divisible par 2
 * 
 * 
*/
package Exercices;
import java.util.Scanner;
public class exo4 {
    




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divBy2;
        System.out.println("Entrer le premier à tester");
        divBy2=sc.nextInt();
        if (divBy2%2==0){
            System.out.println("L'entrer est divisible par 2");
        }
        else
        {
            System.out.println("L'entrer n'est pas divisible par 2");
        }
        sc.close();
    }
}
