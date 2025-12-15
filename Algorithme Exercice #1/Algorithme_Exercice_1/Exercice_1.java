package Algorithme_Exercice_1;
import java.util.Scanner;
public class Exercice_1 {
    public static void main(String[] args) {
        int a,b;
        double c;

        Scanner sc= new Scanner(System.in);
        System.out.println("Entrer la premier nombre");
        a=sc.nextInt();
        System.out.println("Entrer le deuxieme nombre");
        b=sc.nextInt();
        c=(a+b)/(double) 2;
        System.out.printf("le resulta est %.2f",c);
        
    }
}
