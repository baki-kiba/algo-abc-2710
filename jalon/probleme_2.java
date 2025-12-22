package jalon;

import java.util.Scanner;

public class probleme_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int solde=3000;
        int retrait; 
        int newSolde=0;
        boolean finOperation=true;
        System.out.println("Bonjour vous avez "+solde+" euro dans votre compte, combien voulez-vous retirer");
        while(finOperation==true){
            retrait=sc.nextInt();
            if(retrait%10==0){
                newSolde=solde-retrait;
                System.out.println(retrait+" a été retiré de compte, il vous reste "+newSolde);
                System.out.println("Souhaitez-vous retirer de nouveau");
                finOperation=sc.nextBoolean();
            }
            if(retrait%10!=0 )
                {System.out.println("Vous pouvez retier que des mutliple de 10");
                
            }
            if(newSolde==-500){
                System.out.println("Vous avez ateint le plafond du decouvert vous etes à moins 500");
                System.out.println("Reprenez votre carte");
                finOperation=false;
                
                

            }

        }sc.close();

    }
}
