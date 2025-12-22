package Algorithme.algorithme_Exercice_2;

import java.util.Scanner;

public class Exercice_1_3 {
    public static void main(String[] args) {
        double nombrea,nombreb,nombrec;
        int premierePossible,deuxiemePossible,troisiemepossible;
        int croissant=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le premier nombre a");
        nombrea=sc.nextDouble();
        System.out.println("Saisir le deuxieme nombre b");
        nombreb=sc.nextDouble();
         System.out.println("Saisir le troisieme nombre c");
        nombrec=sc.nextDouble();
        if(nombrea<nombreb&&nombreb<nombrec){croissant=1;}
        if(nombrea<nombrec&&nombrec<nombreb){croissant=2;}
        if(nombreb<nombrea&&nombrea<nombrec){croissant=3;}
        if(nombreb<nombrec&&nombrec<nombrea){croissant=4;}
        if(nombrec<nombreb&&nombreb<nombrea){croissant=5;}
        if(nombrec<nombrea&&nombrea<nombrec){croissant=6;}
        switch(croissant){
            case 1:
                System.out.println("voici les nombre dans l'ordre croissant cas1");
                break;
            case 2:
                System.out.println("voici les nombre dans l'ordre croissant cas2");
                break;
            case 3 :
                System.out.println("voici les nombre dans l'ordre croissant cas3");
                break;
            case 4 :
                System.out.println("voici les nombre dans l'ordre croissant cas4");
                break;
            case 5 : 
                System.out.println("voici les nombre dans l'ordre croissant cas5");
            case 6 :
                System.out.println("voici les nombre dans l'ordre croissant cas6");
            default:{
                System.out.println("gestion des exption");
            }
        }
        

    }
}
