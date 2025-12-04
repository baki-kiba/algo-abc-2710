package premiere_exercice;
import java.util.Scanner;


public class initiat1 {
    public static void main(String[] args) {
        int a, b,c ;

        Scanner sc = new Scanner(System.in);
        System.out.println("entrer le premier nombre");
        a=sc.nextInt();
        System.out.println("entrer le deuxieme nombre");
        b=sc.nextInt();
        System.out.println("entrer le troisime nombre");
        c=sc.nextInt();

        int res=a*b/c;
        System.out.println("le resultat est "+res);
    }
    
}
