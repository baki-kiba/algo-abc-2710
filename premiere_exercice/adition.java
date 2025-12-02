package premiere_exercice;
import java.util.Scanner;

public class adition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int add1;
        int add2;
        System.out.println("");
        add1=sc.nextInt();
        System.out.println("Entrer un premier nombre de l'addition");
        add2=sc.nextInt();
        int resultat=add1+add2;
        System.out.println("le résultat de l'édition est "+resultat);
        sc.close();

    }
}
