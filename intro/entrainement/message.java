package intro.entrainement;
import java.util.Scanner;

public class message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String VotreNom;
        System.out.println("quel est votre nom ?");
        VotreNom = sc.nextLine();
        System.out.println("Votre nom est "+VotreNom);
        sc.close();

    }
}
