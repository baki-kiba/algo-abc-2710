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

package premiere_exercice;

import java.util.Scanner;
public class divBy2 {
    




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
