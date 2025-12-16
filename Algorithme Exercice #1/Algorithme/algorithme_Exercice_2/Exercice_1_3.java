package Algorithme.algorithme_Exercice_2;

import java.util.Scanner;

public class Exercice_1_3 {
    public static void main(String[] args) {
        double nombrea,nombreb,nombrec;
        int premierePossible,deuxiemePossible,troisiemepossible;

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le premier nombre a");
        nombrea=sc.nextDouble();
        System.out.println("Saisir le deuxieme nombre b");
        nombreb=sc.nextDouble();
         System.out.println("Saisir le troisieme nombre c");
        nombrec=sc.nextDouble();
        if(nombrea<nombreb&&nombrea<nombrec){premierePossible=1;}
        if(nombreb<nombrea&&nombreb<nombrec){deuxiemePossible=2;}
        if(nombrec<nombrea&&nombrec<nombreb){troisiemepossible=3;}

    }
}
