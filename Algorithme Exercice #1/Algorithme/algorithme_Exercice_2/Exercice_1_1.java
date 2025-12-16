package Algorithme.algorithme_Exercice_2;
import java.util.Scanner;

public class Exercice_1_1 {
    public static void main(String[] args) {
        int nombre_a;
        Scanner sc=new Scanner(System.in);
        System.out.println("saisir votre age");
        nombre_a=sc.nextInt();
        if(nombre_a>=18){
            System.out.println("Vous etes majeur");
        }
        else{
            System.out.println("Vous etes mineur");
        }

    }
    
}
