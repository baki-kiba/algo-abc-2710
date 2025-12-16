package Algorithme_Exercice_1;
import java.util.Scanner;

public class Exercoice_1_2 {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double rayon,airSphere,volume,surfaceCirculaire,angleDegrer;
        double pii=Math.PI;
        System.out.println("Entrer le rayon de la sphere");
        rayon=sc.nextDouble();
        airSphere=4*pii*Math.pow(rayon,2);
        System.out.println("L'aire de la sphere est de "+airSphere);
        volume=(rayon*pii*Math.pow(rayon, 3))/3;
        System.out.println("le volume de la sphere est de "+volume);
        sc.close();
        }    
}
