package Algorithme_Exercice_1;

import java.util.Scanner;

public class Exercice_1_3 {

    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
        double rayon,airSphere,volume,surfaceCirculaire,angleDegrer;
        double pii=Math.PI;
        System.out.println("Entrer le rayon de la sphere");
        rayon=sc.nextDouble();
        airSphere=4*pii*Math.pow(rayon,2);
        System.out.println("L'aire de la sphere est de "+airSphere);
        volume=(rayon*pii*Math.pow(3, 3))/3;
        System.out.println("le volume de la sphere est de "+volume);
        System.out.println("Entrer l'angle ");
        angleDegrer=sc.nextDouble();
        surfaceCirculaire=(pii*Math.pow(rayon, 2)*angleDegrer)/360;
        System.out.println("la surface du secteur circulaire est de "+surfaceCirculaire);
        sc.close();
}
}