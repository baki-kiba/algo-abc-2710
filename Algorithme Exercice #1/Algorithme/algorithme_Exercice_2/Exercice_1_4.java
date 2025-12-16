package Algorithme.algorithme_Exercice_2;
import java.util.Scanner;
public class Exercice_1_4 {
    public static void main(String[] args) {
        int annea;        
        Scanner sc= new Scanner(System.in);
        System.out.println("entrer l'année à tester");
        annea= sc.nextInt();
        if(annea%4==0||(annea%100==0&&annea%400==1)){
           
              System.out.println("l'année entrer est bissextile");
        }
        else{
             System.out.println("l'année n'est pas bissextile");
        }
    }
}
