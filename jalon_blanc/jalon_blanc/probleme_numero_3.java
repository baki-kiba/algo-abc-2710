/*
Problème n° 3 :

A l’aide de Scanner et Print, me faire un compte à rebours qui commence à 10, puis arrivé à 0, il affiche bonne année 2026. Le compte à rebours
 ne se lancera pas tant que vous répondez true à la question.


Résultat attendu :

Voulez-vous lancez le compte à rebours ?

true

Lancement du compte à rebours ….

10

9

8

7

6

5

4

3

2

1

*/
package jalon_blanc;

import java.util.Scanner;

public class probleme_numero_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean compteARebours;
        System.out.println("Voulez-vous lancez le compte à rebours ?");
        compteARebours=sc.nextBoolean();
        if(compteARebours==true)
            {for (int i = 10; i >= 1; i--) { // i-- décrémente de 1
            System.out.println(i + " ");
            if(i==1){
            System.out.println("Bonne année 2026");
    }
        }
    }
    

}
}
