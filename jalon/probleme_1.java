package jalon;
import java.util.Scanner;
public class probleme_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean resultat;
        boolean a ;
        boolean b ;
        boolean c ;

        System.out.println("donnée la valeur de a");
        a=sc.nextBoolean();
        System.out.println("donnée la valeur de b");
        b=sc.nextBoolean();
        System.out.println("donnée la valeur de c");
        c=sc.nextBoolean();
        resultat=a||b&&!c;
        System.out.println(resultat);
        sc.close();
    }
}
