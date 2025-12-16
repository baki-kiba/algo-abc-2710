package Algorithme_Exercice_1;
import java.util.Scanner;
public class Ecercice_1_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double nombre_a,nombre_b,nombre_c;
        System.out.println("entrer le premier nombre");
        nombre_a=sc.nextDouble();
        System.out.println("entrer le deuxieme nombre");
        nombre_b=sc.nextDouble();
        System.out.println("Vous avez choisie les nombre "+nombre_a+"et nombre "+nombre_b);
        nombre_c=nombre_a;
        nombre_a=nombre_b;
        nombre_b=nombre_c;
        System.out.println("Vous avez choisie les nombre "+nombre_a+"et nombre "+nombre_b);
        sc.close();
    }
    
}
