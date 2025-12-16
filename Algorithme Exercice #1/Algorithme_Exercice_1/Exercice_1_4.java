package Algorithme_Exercice_1;
import java.util.Scanner;
public class Exercice_1_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double sommePlacee,intertSimple,interCompose,totalInteretComposer,totalInteretSimple,interet;
        int nombreAnnee;
        System.out.println("Quelles somme voulez-vous placer");
        sommePlacee=sc.nextDouble();
        System.out.println("Pendant combien d'année");
        nombreAnnee=sc.nextInt();
        System.out.println("Quelle sont les interet");
        interet=sc.nextDouble();
        totalInteretSimple=sommePlacee*(1+nombreAnnee*interet);
        totalInteretComposer=sommePlacee*Math.pow((1+interet), sommePlacee);
        System.out.printf("Vous gagnerai pour les interêt simple la somma de %.f2",totalInteretSimple);
        System.out.printf("Vous gagnerai pour les interêt composer la somma de %.f2",totalInteretComposer);
        sc.close();
        
    }
}
