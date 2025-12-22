package jalon;
import java.util.Scanner;
public class probleme_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puissance;
        System.out.println("Combien de voulez-vous compter de puissance de 2 ?");
        puissance=sc.nextInt();
        for (int i = 0; i <= puissance; i++) {
            System.out.println("2 puissance "+i+"= "+Math.pow(2,i));
            
            
        }
        sc.close();
    }
}
