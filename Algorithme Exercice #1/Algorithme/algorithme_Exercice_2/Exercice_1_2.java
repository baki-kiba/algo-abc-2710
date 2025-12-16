package Algorithme.algorithme_Exercice_2;
import java.util.Scanner;

public class Exercice_1_2 {
    public static void main(String[] args) {
        int nombrea,nombreb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le premier nombre a");
        nombrea=sc.nextInt();
        System.out.println("Saisir le deuxieme nombre b");
        nombreb=sc.nextInt();
        if(nombrea<nombreb){
            System.out.println("L'ordre croissant est "+nombrea+" puis "+nombreb);
        }else{
            System.out.println("L'ordre croissant est "+nombreb+" puis "+nombrea);
        }

    }
}
