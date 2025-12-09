package premiere_exercice;
import java.util.Scanner;
public class switchcase{
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();
        while(age<0){
            System.out.println("Quel est votre age");
            age=sc.nextInt();}
                switch(age){ /* On initialise le switch avec la variable age , on va tester si age à les valeurs suivantes */
                    /* En fonction des valeurs le message change */
                    case 0,1,2,3,4:
                        System.out.println("Vous êtes un bébé");
                        break;

                    case 5,6,7:
                        System.out.println("Vous êtes un enfant");
                        break;
                    case 8,9,10,11,12:
                        System.out.println("Vous êtes un pré-ados");
                        break;
                    case 13,14,15,16,17,18,19,20:
                        System.out.println("Vous êtes un Adolescents");
                        break;
                    case 21,22,23,24:
                        System.out.println("Vous êtes un jeune Adulte");
                        break;
                    case 25,26,27,28,29,30,31,32,33,34,35,36,37,38,39 :
                        System.out.println("Vous êtes un adulte");
                        break;
                    case 40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59:
                        System.out.println("Vous êtes un adulte mure");
                        break;
                    default:
                        System.out.println("vous êtes un senior");

                }

            }
        }