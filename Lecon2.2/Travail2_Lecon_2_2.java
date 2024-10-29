/*******************************************************************
 * Nom : Adam Benmoussa                                           *
 * Année d'étude : 12e année                                      *
 * Courriel : benada07@ecolecatholique.ca                         *
 * Titre : Travail 2 - Leçon 2.2                                  *
 * Cours : ICS4U - Génie informatique                             *
 * Date : Le Mercredi 25 septembre 2024                           *
 *******************************************************************/
import java.util.Scanner;

public class Travail2_Lecon_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quelle est ton nombre?: "); // Je demande à l'utilisateur leur nombre
        int numero1 = input.nextInt();
        input.close();
        boolean premier = true; // Je crée une variable boolean appelée: "premier" et je la définis en tant que : true
        for (int i = 2; i < numero1; i++) { // Je crée une boucle for et une variable i qui va de 2 à numero1 (car 1 est premier). Si numero1 modulo i n'a pas de reste, le numero1 est premier!
            if (numero1 % i == 0) {
                System.out.println("Le nombre " + numero1 + " n'est pas premier!");
                premier = false;
                break;
            }
        }
        if (premier == true) {
            System.out.println("Le nombre " + numero1 + " est premier");
        }
    }
}