package jalon_blanc;
/*
A l’aide de Scanner et Print, me créer un algorithme capable de déterminer si deux nombres sont supérieur, inférieur à l’un l’autre.


Résultat attendu :


Votre valeur de a :

5


Votre valeur de b :

5


Après comparaison : a et b sont égaux
*/

import java.util.Scanner;
public class probleme_numero_1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a,b;
    System.out.println("Votre valeur de a :");
    a=sc.nextInt();
    System.out.println("Votre valeur de b :");
    b=sc.nextInt();
    if(a<b){
        System.out.println("Après comparaison : a est inferieur à b");
    }
    if(a==b){
        System.out.println("Après comparaison : a et b sont égaux");
    }
    if(a>b){
        System.out.println("\"Après comparaison : a est superieur à b");
    }

    }
    


    
}
