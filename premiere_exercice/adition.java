package premiere_exercice;
import java.util.Scanner;

public class adition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int add1, add2;
         //première entrer
        System.out.println("Entrer le premier nombre de l'addition");
       
        add1=sc.nextInt();
         //deuxime entrer
        System.out.println("Entrer le deuxieme nombre de l'addition11");
        add2=sc.nextInt();
        int resultat=add1+add2;
        System.out.println("le résultat de l'adition est "+resultat);
        sc.close();

    }
}
